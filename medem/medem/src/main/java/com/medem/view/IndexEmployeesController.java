package com.medem.view;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.medem.helpers.EmployeeHelper;
import com.medem.service.EmployeeService;

@Controller
public class IndexEmployeesController {

	@Autowired
	private EmployeeService employeeService;
	
	private static final Logger logger = Logger.getLogger(IndexEmployeesController.class);
	private EmployeeHelper employeeHelper;
	

}
