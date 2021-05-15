package com.sagar.schoolmanagementapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
	@GetMapping("/homepage")
	public ModelAndView getHomePage() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("homepage");
		return modelAndView;
	}

}
