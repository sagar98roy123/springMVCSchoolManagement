package com.sagar.schoolmanagementapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sagar.schoolmanagementapplication.model.User;

@Controller
public class StudentController {
	
	@GetMapping("/register")
	public ModelAndView getRegistrationPage() {
		ModelAndView modelAndView=new ModelAndView();
		ModelMap modelMap=new ModelMap();
		User user=new User();
		modelMap.addAttribute("userpat", user);
		modelAndView.addAllObjects(modelMap);
		modelAndView.setViewName("register");
		return modelAndView;
	}
	@PostMapping("/post-register")
	public ModelAndView postRegistrationPage(@ModelAttribute("userpat") User user) {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("user", user);
		modelAndView.setViewName("login");
		return modelAndView;
	}

}
