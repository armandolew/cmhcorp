package com.medem.view;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.medem.model.User;

@Controller
public class AddUserController {
	
	private static final Logger logger = Logger.getLogger(AddUserController.class);

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public ModelAndView addUserPage(@ModelAttribute("user") User user){
		ModelAndView model = new ModelAndView();
		BasicConfigurator.configure();
		try{
			Md5PasswordEncoder encoder = new Md5PasswordEncoder();
			String hashedPass = encoder.encodePassword(user.getPassword(), null);
			logger.info(user.getUsername() + "- Original: " + user.getPassword() + " - MD5: " + hashedPass);
			
		}
		catch(Exception e){
			logger.debug(e);
		}
		
		model.setViewName("newUser");
		return model;
		
	}
}
