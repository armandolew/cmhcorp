package com.medem.view;

import java.io.File;

import org.apache.commons.io.FilenameUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.medem.MainController;
import com.medem.dto.Assembler;
import com.medem.model.Employee;
import com.medem.model.FileUpload;
import com.medem.service.EmployeeService;

@Controller
public class FileUploadController {
    
    @Autowired
    private EmployeeService employeeService;

    private static final Logger logger = Logger.getLogger(MainController.class);

    
	@RequestMapping(value = "/upload**", method = RequestMethod.GET)
    public ModelAndView uploadPage(@RequestParam(value = "employeeId", required = false) int employeeId) {
        ModelAndView model = new ModelAndView();
        model.addObject("uploadForm", new FileUpload());
        model.addObject("employeeId", employeeId);
        model.setViewName("uploadFile");
        return model;
    }
	


	@RequestMapping(value = "/saveFile**", method = RequestMethod.POST)
	public ModelAndView saveFilePage(@RequestParam(value = "file") MultipartFile file, @RequestParam(value = "employeeId") int employeeId){
	   ModelAndView model = new ModelAndView();
	   BasicConfigurator.configure();
	   try{
	       String directory = "/home/indigo/Documentos/";
	       String imageApplicationDirectory = "/medem/employee/images/";
	       Employee employee = Assembler.createEmployee(employeeService.getEmployeeById(employeeId));
	       String newFileName = directory + "medem-employee-" + employee.getId() + employee.getName() + "." + FilenameUtils.getExtension(file.getOriginalFilename());
	       String newAppFileName = imageApplicationDirectory + "medem-employee-" + employee.getId() + employee.getName() + "." + FilenameUtils.getExtension(file.getOriginalFilename());
	       employee.setProfileImage(newAppFileName);
	       employeeService.updateEmployee(employee);
	       file.transferTo(new File(newFileName));
	       
	   }
	   catch(Exception e){
	       logger.error(e);
	   }
	   
	   model.setViewName("redirect:/employee/" + employeeId);
	   
	   return model;
	}
}
