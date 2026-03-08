package com.example.regist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@GetMapping("/")
	public String showForm() {
		return "hello";
	}
	
	@PostMapping("/add")
	public ModelAndView showReg(@RequestParam String name,
								ModelAndView mav) {
		mav.setViewName("register");
		mav.addObject("name", name);
		return mav;
	}
}
