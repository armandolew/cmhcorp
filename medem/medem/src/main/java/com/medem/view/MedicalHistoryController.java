package com.medem.view;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.medem.dto.Assembler;
import com.medem.dto.MedicalHistoryDTO;
import com.medem.model.MedicalHistory;
import com.medem.model.User;
import com.medem.security.AuthenticationFacadeImpl;
import com.medem.service.EmployeeService;
import com.medem.service.MedicalHistoryService;
import com.medem.service.RiskService;
import com.medem.service.UserService;

@Controller
public class MedicalHistoryController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private RiskService riskService;
	
	@Autowired
	private MedicalHistoryService medicalHistoryService;
	
	@Autowired
	private UserService userService;
	
	private static final Logger logger = Logger.getLogger(EmployeeController.class);
	
	private AuthenticationFacadeImpl authenticationFacadeImpl = new AuthenticationFacadeImpl();
	
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
     SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
     dateFormat.setLenient(false);
     webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }   	

    @RequestMapping(value = "/medicalHistory/{id}", method = RequestMethod.GET)
    public ModelAndView medicalRecordPage(@PathVariable(value = "id") Integer id) {
        
        ModelAndView model = new ModelAndView();
        UserDetails userDetails = (UserDetails) authenticationFacadeImpl.getAutentication().getPrincipal();
        
        logger.info(checkMedicalHistory(id));
        
        User user = Assembler.createUser(userService.getFullUserByName(userDetails.getUsername()));
        
        if(checkMedicalHistory(id) !=null){
            model.setViewName("redirect:/showMedicalHistory/" + checkMedicalHistory(id).getId());
        }
        else{
        
          model.addObject("medicalHistory", new MedicalHistoryDTO());
          model.addObject("user", user);
          model.addObject("employee", employeeService.getEmployeeById(id));
        
          model.setViewName("medicalRecord");
        }
        return model;
    }	
	
	@RequestMapping(value = "/addMedicalHistory**", method = RequestMethod.POST)
	public ModelAndView addMedicalHistoryPage(@ModelAttribute("medicalHistory") MedicalHistoryDTO medicalHistoryDTO){	    
	    ModelAndView model = new ModelAndView();	  
	    
	    try{
	        this.medicalHistoryService.addMedicalHistory(medicalHistoryDTO);
	        model.setViewName("redirect:/employee/" + medicalHistoryDTO.getEmployee().getId());
	    }
	    catch(Exception e){
	        logger.error(e);
	    }
	    
	    return model;
	}
	
	@RequestMapping(value = "/showMedicalHistory/{id}", method = RequestMethod.GET)
	public ModelAndView showMedicalHistoryPage(@PathVariable(value = "id") int id){
	    ModelAndView model = new ModelAndView();
	    
	    try{
	        MedicalHistoryDTO medicalHistoryDTO = this.medicalHistoryService.getFullMedicalHistoryById(id);
	        model.addObject("medicalHistory", medicalHistoryDTO);
	    }
	    
	    catch(Exception e){
	        logger.error(e);
	    }
	    
	    model.setViewName("showMedicalHistory");
	    return model;
	}
	
	private MedicalHistoryDTO checkMedicalHistory(int id_employee){
	    MedicalHistoryDTO medicalHistoryDTO = null;
	    
	    try{
	        medicalHistoryDTO = medicalHistoryService.getMedicalHistoryByEmployee(id_employee); 
	    }
	    catch(Exception e){
	        logger.error(e);
	    }
	    
	    return medicalHistoryDTO;
	}
}
