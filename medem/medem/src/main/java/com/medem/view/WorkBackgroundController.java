package com.medem.view;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.medem.model.WorkBackground;
import com.medem.service.WorkBackgroundService;

@Controller
public class WorkBackgroundController {
	
	@Autowired
	private WorkBackgroundService workBackgroundService;
	
	private static final Logger logger = Logger.getLogger(WorkBackgroundController.class);
	
	@RequestMapping(value = "/workBackground**", method = RequestMethod.GET)
	public ModelAndView workBackgroundPage(@RequestParam(value="id", required=false) Integer id){
		ModelAndView model = new ModelAndView();
		BasicConfigurator.configure();
		model.addObject("WorkBackground", new WorkBackground());
		model.addObject("employeeId", id);
		try{
			model.addObject("listWorkBackgrounds", workBackgroundService.listWorkBackgrounds(id));
		}
		catch(Exception e){
			logger.debug(e);
		}
		model.setViewName("workBackground");
		return model;
	}
}
