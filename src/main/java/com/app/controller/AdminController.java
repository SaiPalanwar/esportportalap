package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Admin")
public class AdminController {

	public AdminController() {
		
	}
	
	@GetMapping("/Dashboard")
	public String showDashborad() {
		return "/Admin/Dashboard";
	}
}
