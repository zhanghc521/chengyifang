package com.cyf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cyf.model.User;
import com.cyf.service.UserService;

@Controller()
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/login.htm")
	public ModelAndView login(User user){
		
		ModelAndView result = new ModelAndView("/index");
		
		
		System.out.println("abc");
		return result;
	}

}
