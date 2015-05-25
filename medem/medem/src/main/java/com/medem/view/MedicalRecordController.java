package com.medem.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.medem.model.MedicalRecord;
import com.medem.service.EmployeeService;

@Controller
public class MedicalRecordController {
	
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/medicalRecord**", method = RequestMethod.GET)
	public ModelAndView medicalRecordPage(@RequestParam(value="id", required=true) Integer id){
	  ModelAndView model = new ModelAndView();
	  model.addObject("MedicalRecord", new MedicalRecord());
	  model.addObject("employee", employeeService.getEmployeeById(id));
	  model.setViewName("medicalRecord");
	  return model;
	}	
}
