package com.medem.view;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.medem.helpers.FamilyHistoryHelper;
import com.medem.model.FamilyHistory;
import com.medem.service.FamilyHistoryService;

@Controller
public class FamilyHistoryController {
	
	@Autowired
	private FamilyHistoryService familyHistoryService;
	
	private static final Logger logger = Logger.getLogger(FamilyHistoryController.class);
	
	@RequestMapping(value = "/familyHistory**", method = RequestMethod.GET)
	public ModelAndView familyHistoryPage(@RequestParam(value="id", required=false) Integer id){
		
	  FamilyHistoryHelper familyHistoryHelper = new FamilyHistoryHelper();
		
	  ModelAndView model = new ModelAndView();
	  model.addObject("FamilyHistory", new FamilyHistory());
	  
	  BasicConfigurator.configure();
	  
	  try{
		  model.addObject("listFamilyHistory", familyHistoryService.listFamilyHistory(id));
		  model.addObject("listFamilyDiseases", familyHistoryService.listFamilyDiseases());
	  }
	  catch(Exception e){
		  logger.debug(e);
	  }
	  model.addObject("familyHistoryHelper", familyHistoryHelper);
	  model.addObject("employeeId", id);
	  model.setViewName("familyHistory");
	  return model;
	}
}
