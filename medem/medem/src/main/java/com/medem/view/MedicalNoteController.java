package com.medem.view;

import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.medem.dto.MedicalNoteDTO;
import com.medem.model.MedicalNote;
import com.medem.service.MedicalNoteService;

@Controller
public class MedicalNoteController {
	
	@Autowired
	private MedicalNoteService medicalNoteService;
	
	private static final Logger logger = Logger.getLogger(MedicalNoteController.class);
	
	@RequestMapping(value = "/medicalNote**", method = RequestMethod.GET)
	public ModelAndView medicalNotePage(@RequestParam(value="id", required=false) Integer id){
	  ModelAndView model = new ModelAndView();
	  BasicConfigurator.configure();
	  model.addObject("MedicalNote", new MedicalNote());
	  try{
		  model.addObject("listMedicalNotes", medicalNoteService.listMedicalNotes(id));
	  }
	  catch(Exception e){
		  logger.debug(e);
	  }
	  model.addObject("employee_id", id);
	  model.setViewName("medicalNote");
	  return model;
	}
}
