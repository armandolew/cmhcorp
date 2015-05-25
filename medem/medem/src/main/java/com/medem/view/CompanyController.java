package com.medem.view;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.joda.time.LocalDateTime;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.medem.MainController;
import com.medem.dto.ActivityCompanyDTO;
import com.medem.dto.Assembler;
import com.medem.helpers.CompanyHelper;
import com.medem.helpers.ErrorsHelper;
import com.medem.model.ActivityCompany;
import com.medem.model.Company;
import com.medem.model.User;
import com.medem.security.AuthenticationFacadeImpl;
import com.medem.service.ActivityCompanyService;
import com.medem.service.CompanyService;
import com.medem.service.UserService;

/** NewCompanyController
 *  
 *  newCompany view's Controller
 *  Controller that handles all HTTP requests for Company entity
 * 
 * 
 *  @author indigo
 *
 */

@Controller
public class CompanyController{
	
	/** 
	 * companyService
	 * Provides services for Company entity.
	 */
	
	@Autowired
	private CompanyService companyService;
	
	/**
	 * userService
	 * Provides services for User entity.
	 */
	
	@Autowired
	private UserService userService;
	
	/**
	 * companyActivityService
	 * Provides services for CompanyActivity entity.
	 */
	
	@Autowired
	private ActivityCompanyService activityCompanyService;
	
	/**
	 * logger
	 * Sends events to the log.
	 */
	
	private static final Logger logger = Logger.getLogger(MainController.class);
	
	private ErrorsHelper errorsHelper = new ErrorsHelper();
	
	private AuthenticationFacadeImpl authenticationFacadeImpl = new AuthenticationFacadeImpl();
	
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
     SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
     dateFormat.setLenient(false);
     webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }	
	
	/**
	 * newCompanyPage.
	 * Request handler. Displays view to add a new company.
	 * @return ModelAndView model.
	 */
	
	@RequestMapping(value = "/newCompany", method = RequestMethod.GET)
	public ModelAndView newCompanyPage(){
		
		ModelAndView model = new ModelAndView();
		BasicConfigurator.configure();
		LocalDateTime localDateTime = new LocalDateTime();
		
        UserDetails userDetails =
                (UserDetails) authenticationFacadeImpl.getAutentication().getPrincipal();

        User user = Assembler.createUser(userService.getUserByName(userDetails.getUsername())); 
		
		try{

			
			model.addObject("usersAvailable", userService.listUsers());
			model.addObject("company", new Company());
			model.addObject("userName", user.getUsername());
			model.setViewName("newCompany");
			logger.info("Generando nueva empresa por: " + userDetails.getUsername() + "-" + localDateTime);
		}
		catch(Exception e){
			logger.error("newCompany Exception: " + e);
		}
		
		return model;
	}
	
	/**
	 * getTags. 
	 * Method that deals with the request coming from the jquery autocomplete dropdown list.
	 * That list presents a series of company activities so the user can select one.
	 * @param term
	 * @return List<CompanyActivityDTO>
	 */
	
	@RequestMapping(value = "/getTags", method = RequestMethod.GET)
	public @ResponseBody List<ActivityCompanyDTO> getTags(@RequestParam String term){
	    BasicConfigurator.configure();
	    logger.debug(activityCompanyService.listActivitiesFromTag(term));
	    return activityCompanyService.listActivitiesFromTag(term);
	    
	}
	
	/**
	 * addCompanyPage.
	 * Uses the company service to persist a new company.
	 * @param company
	 * @param result
	 * @return ModelAndView model.
	 */
	
   @RequestMapping(value = "/addCompany**", method = RequestMethod.POST)
    public ModelAndView addCompanyPage(@Valid @ModelAttribute("company") Company company, BindingResult result){
        ModelAndView model = new ModelAndView();
        BasicConfigurator.configure();
        
        if(result.hasErrors()){
          model.addObject("message", errorsHelper.getErrorMessages(result.getFieldErrors()));
          model.addObject("usersAvailable", userService.listUsers());
          model.addObject("company", company);
          model.setViewName("newCompany");
          logger.error(result.getAllErrors());
        }
        else{
            try{
                ActivityCompany activityCompany = Assembler.createActivityCompany(activityCompanyService.getActivityCompanyById(company.getActivity().getId()));
                company.setActivity(activityCompany);
                company.setEnabled(true);
                
                logger.info(company.toString());
                
                companyService.addCompany(company);
                model.setViewName("redirect:/company/" + company.getId()); 
                logger.info("agregando empresa");
            }
            catch(Exception e){
                model.addObject("message", e.getMessage());
                model.addObject("company", company);
                model.addObject("usersAvailable", userService.listUsers());
                model.setViewName("newCompany");
                logger.error(e.getMessage());
            }
        }
        
        
        return model;
    }
   
   /**
    * companyPage.
    * Displays the company requested.
    * @param id
    * @return ModelAndView model.
    */

   
   @RequestMapping(value = "/company/{id}", method = RequestMethod.GET)
   public ModelAndView companyPage(@PathVariable(value = "id") int id){
       ModelAndView model = new ModelAndView();
       BasicConfigurator.configure();
       try{
           Company company = Assembler.createCompany(companyService.getFullCompany(id));
           model.addObject("company", company);
       }
       catch(Exception e){
           logger.error(e);
       }
       model.setViewName("showCompany");
       return model;
   }
   
   /** 
    * editCompanyPage.
    * Shows the company to be edited.
    * @param id.
    * @return ModelAndView model.
    */
   
   @RequestMapping(value = "/editCompany/{id}", method = RequestMethod.GET)
   public ModelAndView editCompanyPage(@PathVariable(value ="id") int id){
       ModelAndView model = new ModelAndView();
       BasicConfigurator.configure();
       try{
           Company company = Assembler.createCompany(companyService.getFullCompany(id));
           model.addObject("usersAvailable", userService.listUsers());
           model.addObject("company", company);
       }
       catch(Exception e){
           logger.debug(e);
       }
       
       model.setViewName("editCompany");
       
       return model;
   }
   
   /**
    * updateCompany.
    * Updates company's information.
    * @param company.
    * @param result.
    * @return ModelAndView model.
    */
   
   @RequestMapping(value = "/updateCompany**", method = RequestMethod.POST)
   public ModelAndView updateCompanyPage(@Valid @ModelAttribute("company") Company company, BindingResult result){
       ModelAndView model = new ModelAndView();
       BasicConfigurator.configure();
       try{
//         CompanyActivity companyActivity = Assembler.createCompanyActivity(companyActivityService.getCompanyActivityById(companyActivityId));
//         company.setCompanyActivity(companyActivity);
         logger.info(company.toString());
         companyService.updateCompany(company);
         
       }
       catch(Exception e){
           logger.error(e);
       }
       
       model.setViewName("redirect:/company/" + company.getId());
       return model;
   }
   
   /**
    * deleteCompanyPage.
    * Deletes a company.
    * @param id
    * @return ModelAndView model.
    */
   
   @RequestMapping(value = "/deleteCompany/{id}", method = RequestMethod.GET)
   public ModelAndView deleteCompanyPage(@PathVariable(value = "id") int id){
       ModelAndView model = new ModelAndView();
       BasicConfigurator.configure();
       try{
         companyService.deleteCompany(Assembler.createCompany(companyService.getCompanyById(id)));
         logger.info("DELETED");
       }
       catch(Exception e){
           logger.error("Exception", e);
       }
       
       model.setViewName("redirect:/indexCompany");
       return model;
   }
   
   /**
    * indexCompanyPage.
    * Shows a list of the companies stored in database.
    * @return ModelAndView model.
    */
   
   @RequestMapping(value = "/indexCompany**", method = RequestMethod.GET)
   public ModelAndView indexCompanyPage(){
       
       ModelAndView model = new ModelAndView();
       model.addObject("listCompanies", companyService.listCompanies());
       model.addObject("companyHelper", new CompanyHelper());
       model.setViewName("indexCompany");
       return model;
   }   
   
   /**
    * seachCompany.
    * Sets a list of companies matching the search criteria.
    * @param companyName
    * @return ModelAndView model.
    */
   
   @RequestMapping(value = "/seachCompany**", method = RequestMethod.POST)
   public ModelAndView searchCompanyPage(@RequestParam(value = "search") String companyName){
       ModelAndView model = new ModelAndView();
       BasicConfigurator.configure();
       try{
           model.addObject("listCompanies", companyService.searchCompanyByName(companyName));
       }
       catch(Exception e){
           logger.error(e);
       }
       model.setViewName("indexCompany");
       return model;
   }

	
}