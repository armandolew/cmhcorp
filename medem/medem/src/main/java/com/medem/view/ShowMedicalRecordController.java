package com.medem.view;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.medem.service.EmployeeService;
import com.medem.service.MedicalRecordService;

@Controller
public class ShowMedicalRecordController {

	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private MedicalRecordService medicalRecordService;
	
	private static final Logger logger = Logger.getLogger(AddMedicalRecordController.class);
	
	@RequestMapping(value = "/showMedicalRecord**", method = RequestMethod.GET)
	public ModelAndView showMedicalRecordPage(@RequestParam(value = "id", required=true) int id){
		ModelAndView model = new ModelAndView();
		model.addObject("employee", employeeService.getEmployeeById(id));
		BasicConfigurator.configure();
		
		try{
		  
		}
		catch (Exception e){
			logger.debug("Exception: " + e);
		}
		model.setViewName("showMedicalRecord");
		return model;
	}
}
