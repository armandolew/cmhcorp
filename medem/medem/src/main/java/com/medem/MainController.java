package com.medem;

import java.util.List;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.medem.dto.MedicalNoteDTO;
import com.medem.helpers.ErrorsHelper;
import com.medem.helpers.MedicalExamHelper;
import com.medem.model.FamilyHistory;
import com.medem.model.MedicalExam;
import com.medem.model.MedicalNote;
import com.medem.model.WorkBackground;
import com.medem.service.CompanyService;
import com.medem.service.EmployeeService;
import com.medem.service.FamilyHistoryService;
import com.medem.service.MedicalExamService;
import com.medem.service.MedicalNoteService;
import com.medem.service.MedicalHistoryService;
import com.medem.service.WorkBackgroundService;

@Controller
public class MainController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private MedicalNoteService medicalNoteService;
	
	@Autowired
	private FamilyHistoryService familyHistoryService;
	
	@Autowired
	private CompanyService companyService;
	
	@Autowired
	private WorkBackgroundService workBackgroundService;
	
	@Autowired
	private MedicalHistoryService medicalRecordService;
	
	@Autowired
	private MedicalExamService medicalExamService;
	
	private ErrorsHelper errorsHelper = new ErrorsHelper();
	
	private static final Logger logger = Logger.getLogger(MainController.class);
	
 
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ModelAndView adminPage(){
		ModelAndView model = new ModelAndView();
		model.setViewName("admin");
		return model;
	}
	
	
	@RequestMapping(value = "/addMedicalNote**", method = RequestMethod.POST)
	public ModelAndView addMedicalNotePage(@ModelAttribute("MedicalNote") MedicalNote mn){
	  System.out.println(mn.toString());
 
	  medicalNoteService.addMedicalNote(mn);
	  
	  List <MedicalNoteDTO> listMedicalNotes = medicalNoteService.listMedicalNotes(mn.getEmployee_id());
	  ModelAndView model = new ModelAndView();
	  model.addObject("MedicalNote");
	  model.addObject("listMedicalNotes", listMedicalNotes);
	  model.addObject("employee_id", mn.getEmployee_id());
	  model.setViewName("medicalNote");
	  return model;
	}	
	

	
	@RequestMapping(value = "/addFamilyHistory**", method = RequestMethod.POST)
	public ModelAndView addFamilyHistory(@ModelAttribute("FamilyHistory") FamilyHistory fh){
	
		System.out.println(fh.toString());
		System.out.println(fh.getEmployee_id());
		familyHistoryService.addFamilyHistory(fh);
		
		ModelAndView model = new ModelAndView();
		model.addObject("FamilyHistory", new FamilyHistory());
		model.addObject("listFamilyHistory", familyHistoryService.listFamilyHistory(fh.getEmployee_id()));
		model.setViewName("familyBackground");
		return model;
	}	
	

	

	

	
	@RequestMapping(value = "/addWorkBackground**", method = RequestMethod.POST)
	public ModelAndView addWorkBackground(@ModelAttribute("WorkBackground") WorkBackground wb){
	
		ModelAndView model = new ModelAndView();
		try{
			logger.debug(wb.getEmployeeId());
			workBackgroundService.addWorkBackground(wb);
			model.addObject("listWorkBackgrounds", workBackgroundService.listWorkBackgrounds(wb.getEmployeeId()));
		}
		catch(Exception e){
			
		}
		
		model.setViewName("redirect:/workBackground?id=" + wb.getEmployeeId());
		return model;
	}
	

	@RequestMapping(value = "/medicalExam**", method = RequestMethod.GET)
	public ModelAndView medicalExamPage(@RequestParam(value="id", required=true) Integer id){
		ModelAndView model = new ModelAndView();
		model.addObject("MedicalExam", new MedicalExam());
		model.addObject("employee", employeeService.getEmployeeById(id));
		model.setViewName("medicalExam");
		return model;
	}
	
	@RequestMapping(value = "/addMedicalExam**", method = RequestMethod.POST)
	public ModelAndView addMedicalExamPage(@Valid @ModelAttribute("MedicalExam") MedicalExam medicalExam, BindingResult result){
	  ModelAndView model = new ModelAndView();
	  
	  if (result.hasErrors()){

		  String errorMessages = errorsHelper.getErrorMessages(result.getFieldErrors());
		  model.addObject("errorMessage", errorMessages);
		  model.addObject("MedicalExam", new MedicalExam());
		  model.setViewName("medicalExam");
	  }
	  else{
		try{
		  	medicalExamService.addMedicalExam(medicalExam);
	  	}
	  	catch(Exception e){
		  	System.out.println(e);
	  	}
	  
	  	model.setViewName("redirect:/indexEmployeeMedicalExams?id=" + medicalExam.getEmployeeId());
	  }
	  return model;
	}
	
	@RequestMapping(value = "/indexEmployeeMedicalExams**", method = RequestMethod.GET)
	public ModelAndView indexEmployeeMedicalExamsPage(@RequestParam(value="id", required=true) Integer employeeId){
		ModelAndView model = new ModelAndView();
		model.addObject("medicalExamHelper", new MedicalExamHelper());
		model.addObject("listMedicalExams", medicalExamService.listMedicalExam(employeeId));
		model.setViewName("indexEmployeeMedicalExams");
		return model;
	}
 
	//for 403 access denied page
	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public ModelAndView accesssDenied() {
 
	  ModelAndView model = new ModelAndView();
 
	  //check if user is login
	  Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	  if (!(auth instanceof AnonymousAuthenticationToken)) {
		UserDetails userDetail = (UserDetails) auth.getPrincipal();	
		model.addObject("username", userDetail.getUsername());
	  }
 
	  model.setViewName("403");
	  return model;
 
	}
	
	@RequestMapping(value = "/404", method = RequestMethod.GET)
	public ModelAndView pageNotFound(){
		ModelAndView model = new ModelAndView();
		model.setViewName("404");
		
		return model;
	}
 
}