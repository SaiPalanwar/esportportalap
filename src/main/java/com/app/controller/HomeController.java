package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.User;
import com.app.service.HomeServiceInterface;

@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	private HomeServiceInterface homeService;

	public HomeController() {

	}

	@GetMapping("/")
	public String showIndex() {
		return "/index";
	}

	@GetMapping("/registeration")
	public String showRegister() {
		return "/register";
	}

	@PostMapping("/signup")
	public String signup(@RequestParam String type, @RequestParam String name, @RequestParam String email,
			@RequestParam String password, HttpSession hs, Model modelMap, RedirectAttributes flashMap) {
		User user = new User(name, email, password, type);

		flashMap.addFlashAttribute("message", homeService.registerUser(user));

		return "redirect:/";
	}

	@PostMapping("/login")
	public String login(@RequestParam String email, @RequestParam String password, HttpSession hs, Model modelMap,
			RedirectAttributes flashMap) {
		User user1 = homeService.loginUser(email, password);
		if (user1 != null) {
			if(user1.getType().equals("Admin")) {
			hs.setAttribute("userDetails", user1);
			return "redirect:/Admin/Dashboard";
			}else {
				hs.setAttribute("userDetails", user1);
				return "redirect:/User/Dashboard";
			}
		} else {
			flashMap.addFlashAttribute("message", "Invalid Password");
			return "redirect:/";
		}
	}
	
	@GetMapping("/Dashboard")
	public String onetwo() {
		return "/Dashboard";
	}
}
