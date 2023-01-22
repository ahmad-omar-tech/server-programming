package com.example.modelandview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/index")
	public String mainpage() {
		return "index";
	}

	@RequestMapping("/contact")
	public String contactpage() {
		return "contact";
	}
	
}
