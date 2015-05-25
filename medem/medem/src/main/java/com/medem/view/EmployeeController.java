package com.medem.view;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;

import javax.validation.Valid;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.joda.time.LocalTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.medem.dto.Assembler;
import com.medem.helpers.EmployeeHelper;
import com.medem.helpers.ErrorsHelper;
import com.medem.model.Area;
import com.medem.model.BloodGroup;
import com.medem.model.Company;
import com.medem.model.Employee;
import com.medem.model.User;
import com.medem.security.AuthenticationFacadeImpl;
import com.medem.service.AreaService;
import com.medem.service.BloodGroupService;
import com.medem.service.CompanyService;
import com.medem.service.EmployeeService;
import com.medem.service.UserService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private AreaService areaService;
	
	@Autowired
	private CompanyService companyService;
	
	@Autowired
	private BloodGroupService bloodGroupService;
	
	EmployeeHelper employeeHelper;
	
	ErrorsHelper errorsHelper = new ErrorsHelper();
	
	private static final Logger logger = Logger.getLogger(EmployeeController.class);
	
	private AuthenticationFacadeImpl authenticationFacadeImpl = new AuthenticationFacadeImpl();
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
	 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	 dateFormat.setLenient(false);
	 webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}


    @RequestMapping(value = "/newEmployee**", method = RequestMethod.GET)
	public ModelAndView employee()
	{
		ModelAndView model = new ModelAndView();
		BasicConfigurator.configure();
		
        UserDetails userDetails =
                (UserDetails) authenticationFacadeImpl.getAutentication().getPrincipal();

        User user = Assembler.createUser(userService.getFullUserByName(userDetails.getUsername()));
        
        try{
            model.addObject("listAreas", areaService.listAreas(user.getCompany().getId()));
        }
        catch(Exception e){
            model.addObject("message", e.getMessage());
            logger.error(e);
        }
		
	    model.addObject("employee", new Employee());
	    model.addObject("user", user);
		model.setViewName("employee");

		return model;
	}

	
    @RequestMapping(value = "/addEmployee**", method = RequestMethod.POST)
    public ModelAndView addEmployeePage(@Valid @ModelAttribute("employee") Employee employee, BindingResult result){
        ModelAndView model = new ModelAndView();
        
        UserDetails userDetails =
                (UserDetails) authenticationFacadeImpl.getAutentication().getPrincipal();

        User user = Assembler.createUser(userService.getUserByName(userDetails.getUsername())); 
        
        try{
            if(result.hasErrors()){
                model.addObject("message", errorsHelper.getErrorMessages(result.getFieldErrors()));
                model.addObject("Employee", employee);
                model.addObject("user", user);
                model.addObject("listAreas", areaService.listAreas(user.getCompany().getId()));
                model.setViewName("employee");   
                logger.error(result.getFieldErrors());
            }
            else{
              Area employeeArea = (Area) Assembler.createArea(areaService.getAreaById(employee.getArea().getId()));
              BloodGroup employeeBloodGroup = (BloodGroup) Assembler.createBloodGroup(bloodGroupService.getBloodGroupById(employee.getBloodGroup().getId()));
              Company employeeCompany = (Company) Assembler.createCompany(companyService.getCompanyById(employee.getCompany().getId()));
            
              employee.setArea(employeeArea);
              employee.setBloodGroup(employeeBloodGroup);
              employee.setCompany(employeeCompany);
              employee.setEnabled(true);
              employeeService.addEmployee(employee);
              model.setViewName("redirect:/employee/" + employee.getId());
              logger.info("USER: " + user.getUsername() + "creating new employee :: " + LocalTime.now());
            }
        }
        catch(Exception e){
            model.addObject("message", e.getMessage());
            model.setViewName("employee"); 
            logger.error(e);
        }
        
        
        return model;
    }	
    
    @RequestMapping(value = "/employeeInformation", method = RequestMethod.GET)
    public @ResponseBody Hashtable<String, Object> getEmployeeInformation(@RequestParam(value = "id") int id){
        
        Hashtable<String, Object> employeeHash = new Hashtable<String, Object>();
        
        try{
          Employee employee = Assembler.createEmployee(employeeService.getFullEmployee(id));
          EmployeeHelper employeeHelper = new EmployeeHelper();
          
        
          employeeHash.put("id", employee.getId());
          employeeHash.put("name", employee.getName());
          employeeHash.put("lastName1", employee.getLastName1());
          employeeHash.put("lastName2", employee.getLastName2());
          employeeHash.put("gender", employee.getGender());
          employeeHash.put("fullGender", employeeHelper.getGender(employee.getGender()));
          employeeHash.put("maritalStatus", employee.getMaritalStatus());
          employeeHash.put("fullMaritalStatus", employeeHelper.getMaritalStatus(employee.getMaritalStatus()));
          employeeHash.put("religion", employee.getReligion());
          employeeHash.put("bloodGroup", employee.getBloodGroup());
          employeeHash.put("fullBloodGroup", employee.getBloodGroup().getGroup());
          employeeHash.put("rh", employee.getRh());
          employeeHash.put("fullRh", employeeHelper.getRh(employee.getRh()));
          employeeHash.put("phone", employee.getPhone());
          employeeHash.put("originPlace", employee.getOriginPlace());
          employeeHash.put("contactName", employee.getContactName());
          employeeHash.put("contactPhone", employee.getContactPhone());
          employeeHash.put("area.id", employee.getArea().getId());
          employeeHash.put("areaName", employee.getArea().getName());
          employeeHash.put("createdAt", employee.getCreatedAt());
          employeeHash.put("createdBy", employee.getCreatedBy());
          employeeHash.put("company.id", employee.getCompany().getId());
          employeeHash.put("dateOfBirth", employee.getDateOfBirth());
          employeeHash.put("age", employeeHelper.getEmployeeAge(employee.getDateOfBirth()));
          employeeHash.put("address.street", employee.getAddress().getStreet());
          employeeHash.put("address.town", employee.getAddress().getTown());
          employeeHash.put("address.zipcode", employee.getAddress().getZipcode()); 
          employeeHash.put("profileImage", employee.getProfileImage());
 
        }
        catch(Exception e){
            
        }
        
        return employeeHash;
    }
    
    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    public ModelAndView showEmployeePage(@PathVariable(value="id") Integer id){
       ModelAndView model = new ModelAndView();
       BasicConfigurator.configure();
       
       UserDetails userDetails =
               (UserDetails) authenticationFacadeImpl.getAutentication().getPrincipal();

       User user = Assembler.createUser(userService.getFullUserByName(userDetails.getUsername()));       
       
       try{
           model.addObject("id", id);
           model.addObject("user", user);
           model.setViewName("employeeShow");
       }
       catch(Exception e){
           model.addObject("user", user);
           model.setViewName("404");
           logger.error(e.getMessage());
       }
       return model;
    }    
    
    @RequestMapping(value = "/indexEmployees**", method = RequestMethod.GET)
    public ModelAndView indexEmployeesPage(){
        ModelAndView model = new ModelAndView();
        model.setViewName("redirect:/indexEmployees/1/10");
        return model;
    }    
    
    @RequestMapping(value = "/indexEmployees/{page}/{recordsPerPage}", method = RequestMethod.GET)
    public ModelAndView indexEmployeePaginationPage(@PathVariable(value = "page") int page, @PathVariable(value = "recordsPerPage") int recordsPerPage){
        ModelAndView model = new ModelAndView();
        BasicConfigurator.configure();
        
        UserDetails userDetails =
                (UserDetails) authenticationFacadeImpl.getAutentication().getPrincipal();

        User user = Assembler.createUser(userService.getFullUserByName(userDetails.getUsername()));         
        
        try{
            int totalEmployees = (employeeService.countEmployees(user.getCompany().getId())).intValue();
            int numberOfPages = (int) Math.ceil((double)totalEmployees/recordsPerPage);
            model.addObject("listEmployees", employeeService.listEmployees(page, recordsPerPage, user.getCompany().getId()));
            model.addObject("totalEmployees", totalEmployees);
            model.addObject("numberOfPages", numberOfPages);
            model.addObject("user", user);
            model.setViewName("indexEmployees");
        }
        catch(Exception e){
            model.addObject("user", user);
            model.setViewName("404");
            logger.error(e.getMessage());
        }
        
        return model;        
    }
    
    @RequestMapping(value = "/editEmployee/{id}", method = RequestMethod.GET)
    public ModelAndView editEmployeePage(@PathVariable(value = "id") int employeeId){
        ModelAndView model = new ModelAndView();
        BasicConfigurator.configure();
        
        UserDetails userDetails =
                (UserDetails) authenticationFacadeImpl.getAutentication().getPrincipal();

        User user = Assembler.createUser(userService.getFullUserByName(userDetails.getUsername())); 
        
        try{
            model.addObject("listAreas", areaService.listAreas(user.getCompany().getId()));
            model.addObject("Employee", (Employee) Assembler.createEmployee(employeeService.getFullEmployee(employeeId)));
            logger.info((Employee) Assembler.createEmployee(employeeService.getFullEmployee(employeeId)));
        }
        catch(Exception e){
            model.addObject("message", e.getMessage());
            logger.error(e);
        }

        model.addObject("user", user);
        model.setViewName("editEmployee");

        return model;
    }
    
    @RequestMapping(value = "/updateEmployee**", method = RequestMethod.POST)
    public ModelAndView updateEmployeePage(@Valid @ModelAttribute("Employee") Employee employee, BindingResult result){
        ModelAndView model = new ModelAndView();
        BasicConfigurator.configure();
        
        UserDetails userDetails =
                (UserDetails) authenticationFacadeImpl.getAutentication().getPrincipal();

        User user = Assembler.createUser(userService.getFullUserByName(userDetails.getUsername()));
        
        try{
            employeeService.updateEmployee(employee);
            model.setViewName("redirect:/employee/" + employee.getId());
            logger.info("USER: " + user.getUsername() + "updating employee :: " + LocalTime.now());
        }
        catch(Exception e){
            model.addObject("message", e.getMessage());
            model.addObject("Employee", employee);
            model.setViewName("editEmployee");
            logger.error(e);
        }

        model.addObject("user", user);

        return model;
    }
    
    @RequestMapping(value = "/deleteEmployee/{id}", method = RequestMethod.GET)
    public ModelAndView deleteEmployeePage(@PathVariable(value = "id") int employeeId){
        ModelAndView model = new ModelAndView();
        BasicConfigurator.configure();
        UserDetails userDetails =
                (UserDetails) authenticationFacadeImpl.getAutentication().getPrincipal();

        User user = Assembler.createUser(userService.getFullUserByName(userDetails.getUsername()));        
        
        try{
            employeeService.deleteEmployee(Assembler.createEmployee(employeeService.getEmployeeById(employeeId)));
            model.setViewName("redirect:/indexEmployees");
            logger.info("USER: " + user.getUsername() + " deleting employee :: " + LocalTime.now());
        }
        catch(Exception e){
            model.addObject("message", e.getMessage());
            model.setViewName("redirect:/employee/" + employeeId);
            logger.error(e);
        }
        
        
        return model;
    }
    
    @RequestMapping(value = "/searchEmployee**", method = RequestMethod.POST)
    public ModelAndView searchEmployeePage(@RequestParam(value="search", required=false) String search ){
        ModelAndView model = new ModelAndView();
        BasicConfigurator.configure();
        UserDetails userDetails =
                (UserDetails) authenticationFacadeImpl.getAutentication().getPrincipal();

        User user = Assembler.createUser(userService.getFullUserByName(userDetails.getUsername()));         
        
        try{
            model.addObject("listEmployees", employeeService.searchEmployee(search));
            model.setViewName("indexEmployees");
        }
        catch(Exception e){
            model.addObject("message", e.getMessage());
            logger.error(e);
        }
        
        model.addObject("user", user);
        model.setViewName("indexEmployees");        
        return model;
    }    
    
	
}
