package com.medem.view;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.medem.dto.Assembler;
import com.medem.model.Employee;
import com.medem.model.MedicalHistory;
import com.medem.model.MedicalRecord;
import com.medem.model.Risk;
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

	@RequestMapping(value = "/medicalHistory/{id}", method = RequestMethod.GET)
	public ModelAndView medicalRecordPage(@PathVariable(value = "id") Integer id){
	  ModelAndView model = new ModelAndView();
      UserDetails userDetails =
              (UserDetails) authenticationFacadeImpl.getAutentication().getPrincipal();

      User user = Assembler.createUser(userService.getFullUserByName(userDetails.getUsername()));	  
	  model.addObject("MedicalHistory", new MedicalHistory());
	  model.addObject("user", user);
	  model.addObject("employee", employeeService.getEmployeeById(id));
	  model.setViewName("medicalRecord");
	  return model;
	}	
	
	@RequestMapping(value = "/addMedicalHistory**", method = RequestMethod.POST)
	public ModelAndView addMedicalHistoryPage(@ModelAttribute("MedicalHistory") MedicalHistory medicalHistory){
	    ModelAndView model = new ModelAndView();
	    
	    try{
	        Risk risk = (Risk) Assembler.createRisk(this.riskService.getRiskById(medicalHistory.getRisk().getId()));
	        Employee employee = (Employee) Assembler.createEmployee(this.employeeService.getEmployeeById(medicalHistory.getEmployee().getId()));
	        medicalHistory.setRisk(risk);
	        medicalHistory.setEmployee(employee);
	        
	        this.medicalHistoryService.addMedicalHistory(medicalHistory);
	    }
	    catch(Exception e){
	        model.addObject("message", e.getMessage());
	        model.setViewName("medicalRecord");
	        logger.error(e);
	    }
	    
	    return model;
	}
}
