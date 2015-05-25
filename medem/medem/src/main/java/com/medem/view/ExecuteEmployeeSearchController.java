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

@Controller
public class ExecuteEmployeeSearchController {

	@Autowired
	private EmployeeService employeeService;
	
	private static final Logger logger = Logger.getLogger(ExecuteEmployeeSearchController.class);
	
	@RequestMapping(value = "/searchEmployee**", method = RequestMethod.POST)
	public ModelAndView searchEmployeePage(@RequestParam(value="search", required=false) String search ){
		ModelAndView model = new ModelAndView();
		BasicConfigurator.configure();
		
		try{
			model.addObject("listEmployees", employeeService.searchEmployee(search));
			logger.debug(search);
			model.setViewName("indexEmployees");
		}
		catch(Exception e){
			System.out.println(e);
			model.setViewName("indexEmployees");
		}
		
		return model;
	}
}
