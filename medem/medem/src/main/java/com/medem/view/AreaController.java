package com.medem.view;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.joda.time.LocalTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.medem.dto.Assembler;
import com.medem.helpers.ErrorsHelper;
import com.medem.model.Area;
import com.medem.model.Company;
import com.medem.model.User;
import com.medem.security.AuthenticationFacadeImpl;
import com.medem.service.AreaService;
import com.medem.service.CompanyService;
import com.medem.service.UserService;

@Controller
public class AreaController {
    
    @Autowired
    private AreaService areaService;
	
	@Autowired
	private CompanyService companyService;
	
	@Autowired
	private UserService userService;
	
	private static final Logger logger = Logger.getLogger(AreaController.class);
	
	private AuthenticationFacadeImpl authenticationFacadeImpl = new AuthenticationFacadeImpl();
	
	private ErrorsHelper errorsHelper;
	
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
     SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
     dateFormat.setLenient(false);
     webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }	
	
	@RequestMapping(value = "/newArea/{id}", method = RequestMethod.GET)
	public ModelAndView newAreaPage(@PathVariable(value = "id") int id_company){
	    ModelAndView model = new ModelAndView();
	    BasicConfigurator.configure();
        UserDetails userDetails =
                (UserDetails) authenticationFacadeImpl.getAutentication().getPrincipal();

        User user = Assembler.createUser(userService.getUserByName(userDetails.getUsername()));
	    
	    model.addObject("Area", new Area());
	    model.addObject("id_company", id_company);
	    model.addObject("user", user);
	    model.setViewName("newArea");
	    
	    return model;
	}
	
    @RequestMapping(value = "/addArea**", method = RequestMethod.POST)
    public ModelAndView addAreaPage(@Valid @ModelAttribute("Area") Area area, BindingResult result){
        ModelAndView model = new ModelAndView();
        BasicConfigurator.configure();
        UserDetails userDetails =
                (UserDetails) authenticationFacadeImpl.getAutentication().getPrincipal();

        User user = Assembler.createUser(userService.getUserByName(userDetails.getUsername())); 
        
        try{
            if(result.hasErrors()){
                model.addObject("message", errorsHelper.getErrorMessages(result.getFieldErrors()));
                model.addObject("Area", area);
                model.addObject("id_company", area.getCompany());
                model.addObject("user", user);   
                model.setViewName("newArea");
                logger.error(errorsHelper.getErrorMessages(result.getFieldErrors()));
            }
            else{
                Company company = (Company) Assembler.createCompany(companyService.getCompanyById(area.getCompany().getId()));
                area.setCompany(company);
                areaService.addArea(area);
                model.setViewName("redirect:/areas/" + company.getId());
                logger.info("AREA :: Adding new area :: User: " + user.getUsername() + " :: " + LocalTime.now());
            }
        }
        catch(Exception e){
            model.addObject("message", e.getMessage());
            model.setViewName("newArea");
            logger.error(e.getMessage());            
        }
        
        return model;
    }	

	
    @RequestMapping(value = "/areas/{id}", method = RequestMethod.GET)
    public ModelAndView indexAreasPage(@PathVariable(value = "id") int id_company){
        ModelAndView model = new ModelAndView();
        BasicConfigurator.configure();
        UserDetails userDetails =
                (UserDetails) authenticationFacadeImpl.getAutentication().getPrincipal();

        User user = Assembler.createUser(userService.getUserByName(userDetails.getUsername()));         
        
        try{
            model.addObject("listAreas", areaService.listAreas(id_company));
        }
        catch(Exception e){
            model.addObject("message", e.getMessage());
            logger.error(e.getMessage());
        }
        
        model.addObject("user", user);
        model.addObject("id_company", id_company);
        model.setViewName("indexArea");
        return model;
    }
    
    @RequestMapping(value = "/editArea/{id}", method = RequestMethod.GET)
    public ModelAndView editAreaPage(@PathVariable(value = "id") int id){
        ModelAndView model = new ModelAndView();
        BasicConfigurator.configure();
        UserDetails userDetails =
                (UserDetails) authenticationFacadeImpl.getAutentication().getPrincipal();

        User user = Assembler.createUser(userService.getUserByName(userDetails.getUsername()));
        
        try{
            Area area = Assembler.createArea(areaService.getFullArea(id));
            model.addObject("Area", area);
        }
        catch(Exception e){
            model.addObject("message", e.getMessage());
            logger.error(e);
        }
        
        model.addObject("user", user);
        model.setViewName("editArea");
        return model;
    }
    
    @RequestMapping(value = "/updateArea**", method = RequestMethod.POST)
    public ModelAndView updateAreaPage(@Valid @ModelAttribute("Area") Area area, BindingResult result){
        ModelAndView model = new ModelAndView();
        BasicConfigurator.configure();
        UserDetails userDetails =
                (UserDetails) authenticationFacadeImpl.getAutentication().getPrincipal();

        User user = Assembler.createUser(userService.getUserByName(userDetails.getUsername()));
        
        try{
            if(result.hasErrors()){
                model.addObject("message", errorsHelper.getErrorMessages(result.getFieldErrors()));
                model.addObject("Area", area);
                model.addObject("user", user);   
                model.setViewName("editArea");
                logger.error(errorsHelper.getErrorMessages(result.getFieldErrors()));                
            }
            else{
                logger.info(area.toString());
                areaService.updateArea(area);
                model.setViewName("redirect:/areas/" + area.getCompany().getId());
                logger.info("AREA :: Updating area :: User: " + user.getUsername() + " :: " + LocalTime.now());
            }
        }
        
        catch(Exception e){
            model.addObject("message", e.getMessage());
            model.addObject("Area", area);
            model.addObject("user", user); 
            model.setViewName("editArea");
            logger.error(e);
        }
        
        return model;
    }
    
    @RequestMapping(value = "/searchArea**", method = RequestMethod.POST)
    public ModelAndView searchAreaPage(@RequestParam(value = "search") String search, @RequestParam(value = "companyId") int id_company){
        ModelAndView model = new ModelAndView();
        BasicConfigurator.configure();
        UserDetails userDetails =
                (UserDetails) authenticationFacadeImpl.getAutentication().getPrincipal();

        User user = Assembler.createUser(userService.getUserByName(userDetails.getUsername()));
        
        try{
            model.addObject("listAreas", areaService.searchArea(search, id_company));
            model.addObject("company", companyService.getCompanyById(id_company));
            model.addObject("user", user);
        }
        catch(Exception e){
            model.addObject("message", e.getMessage());
            logger.error(e);
        }
        
        model.setViewName("indexArea");
        return model;
    }
    
    @RequestMapping(value = "/deleteArea/{id}", method = RequestMethod.GET)
    public ModelAndView deleteAreaPage(@PathVariable(value = "id") int areaId){
        ModelAndView model = new ModelAndView();
        BasicConfigurator.configure();
        UserDetails userDetails =
                (UserDetails) authenticationFacadeImpl.getAutentication().getPrincipal();

        User user = Assembler.createUser(userService.getUserByName(userDetails.getUsername()));
        
        int companyId = 0;
        try{
            Area areaToDelete = (Area) Assembler.createArea(areaService.getFullArea(areaId));
            areaService.deleteArea(areaToDelete);
            
            companyId = areaToDelete.getCompany().getId();
            logger.info("AREA :: Deleting area :: User: " + user.getUsername() + " :: " + LocalTime.now());
        }
        catch(Exception e){
            logger.error(e);
        }
        model.setViewName("redirect:/areas/" + companyId);
        return model;
    }
	
}
