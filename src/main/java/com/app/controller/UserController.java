package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/User")
public class UserController {

	public UserController() {
		
	}
	
	@GetMapping("/Dashboard")
	public String showDahboard() {
		return "/User/Dashboard";
	}
	
}
