package com.shyam.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/wish")
	public String wishMe(Model model) {
		model.addAttribute("msg","Good Morning!!");
		return "hello";
	}
}
