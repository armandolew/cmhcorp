package com.medem.view;

import javax.validation.Valid;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.medem.helpers.ErrorsHelper;
import com.medem.model.MedicalRecord;
import com.medem.service.MedicalRecordService;

@Controller
public class AddMedicalRecordController {
	
	@Autowired
	private MedicalRecordService medicalRecordService;
	
	private ErrorsHelper errorsHelper = new ErrorsHelper();
	private static final Logger logger = Logger.getLogger(AddMedicalRecordController.class);
	

	@RequestMapping(value = "/addMedicalRecord**", method = RequestMethod.POST)
	public ModelAndView addMedicalRecordPage(@Valid @ModelAttribute("MedicalRecord") MedicalRecord medicalRecord, BindingResult result){
	  ModelAndView model = new ModelAndView();
	  BasicConfigurator.configure();
//	  try{
//		  medicalRecordService.addMedicalRecord(medicalRecord);
//	  }
//	  catch(Exception e){
//		  System.out.println(e);
//	  }
	  
	  if(result.hasErrors()){
		  model.addObject("errorMessage", errorsHelper.getErrorMessages(result.getFieldErrors()));
		  model.addObject("MedicalRecord", new MedicalRecord());
		  model.setViewName("medicalRecord");
	  }
	  else{
		  try{
			  medicalRecordService.addMedicalRecord(medicalRecord);
			  model.setViewName("redirect:/employeeShow?id=" + medicalRecord.getEmployeeId());
		  }
		  catch (Exception e){
			  logger.debug(e);
		  }
	  }
	  
	  
	  return model;
	}
}
