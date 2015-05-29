package com.medem.view;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.medem.MainController;
import com.medem.security.AuthenticationFacadeImpl;
import com.medem.service.AreaService;
import com.medem.service.EmployeeService;
import com.medem.service.UserService;

@Controller
@SessionAttributes({"session"})
public class DashboardController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private UserService userService;

    @Autowired
    private AreaService areaService;

    private static final Logger logger = Logger.getLogger(MainController.class);

    @RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
    public ModelAndView defaultPage() {

        ModelAndView model = new ModelAndView();
        BasicConfigurator.configure();
        LocalDateTime localDateTime = new LocalDateTime();
        final AuthenticationFacadeImpl authenticationFacadeImpl = new AuthenticationFacadeImpl();


            try {
//                UserDetails userDetails = (UserDetails) authenticationFacadeImpl.getAutentication().getPrincipal();
//                logger.info("Sesion iniciada por " + userDetails.getUsername() + "-" + localDateTime);
//                UserDTO userDTO = userService.getUserByName(userDetails.getUsername());
//                model.addObject("employeeCount", employeeService.countEmployees(userDTO.getCompanyId()));
//                model.addObject("areasCount", areaService.countAreas(userDTO.getCompanyId()));
//                model.addObject("user", userDTO);
                UserDetails userDetails = (UserDetails) authenticationFacadeImpl.getAutentication().getPrincipal();
                model.addObject("username", userDetails.getUsername());
                logger.info("SESION STARTED BY " + userDetails.getUsername() + " - " + localDateTime);
                model.setViewName("dashboard");
                
            } catch (Exception e) {
                logger.error("User unknown");
                model.setViewName("redirect:/login?error");
            }


        return model;

    }
}
