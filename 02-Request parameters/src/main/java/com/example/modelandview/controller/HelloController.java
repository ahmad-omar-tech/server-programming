package com.example.modelandview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String greeting(@RequestParam(value="location")String location, @RequestParam(value="name")String name, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("location", location);
		return "hello";
	}
}
