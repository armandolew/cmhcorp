package com.medem.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.medem.model.User;
import com.medem.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/newUser", method = RequestMethod.GET)
	public ModelAndView newUserPage(){
		ModelAndView model = new ModelAndView();
		model.addObject("user", new User());
		model.setViewName("newUser");
		return model;
	}
}
