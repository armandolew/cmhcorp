package com.medem.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.medem.dto.Assembler;
import com.medem.model.User;
import com.medem.security.AuthenticationFacadeImpl;
import com.medem.service.UserService;

@Component
public class CustomAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
   
    @Autowired
    private UserService userService;
  
    private AuthenticationFacadeImpl authenticationFacadeImpl = new AuthenticationFacadeImpl();
    
    private static final Logger logger = Logger.getLogger(CustomAuthenticationSuccessHandler.class);

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
            Authentication authentication) throws IOException, ServletException {
        
        BasicConfigurator.configure();
        
//        try{
//            logger.debug("CUSTOM_AUTHENTICATION_HANDLER");
//            logger.info(authentication.getName());  
//            
//            //User currentUser = (User) Assembler.createUser(userService.getUserByName(authentication.getName()));
//            response.sendRedirect("welcome");
////            if(currentUser != null){
////                response.sendRedirect("welcome");
////            }
////            else{
////                response.sendRedirect("login?error");
////            }
//        }
//        catch(Exception e){
//            logger.error(e);
//            //response.sendRedirect("login?error");
//        }
        
        try{
            if (authentication.getName() != null){
                UserDetails userDetails =
                        (UserDetails) authenticationFacadeImpl.getAutentication().getPrincipal();

                User user = Assembler.createUser(userService.getUserByName(userDetails.getUsername())); 
                HttpSession session = request.getSession();
                session.setAttribute("username", user.getUsername()); 
                session.setAttribute("usercompany", user.getCompany().getId());
                session.setAttribute("userfirstname", user.getFirstname());
                response.sendRedirect("welcome");
            }
            else{
                response.sendRedirect("login?error");
            }
        }
        catch(Exception e){
            logger.error(e);
            response.sendRedirect("login?error");
        }
        
        

        
    }
    
}
