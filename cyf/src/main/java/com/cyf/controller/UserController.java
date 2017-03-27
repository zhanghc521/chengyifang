package com.cyf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cyf.service.UserService;

@Controller("userController")
public class UserController {
	
	@Autowired
	UserService userService;

}
