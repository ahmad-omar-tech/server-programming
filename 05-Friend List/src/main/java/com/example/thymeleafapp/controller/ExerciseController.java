package com.example.thymeleafapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class ExerciseController {

	private List<String> getlist = new ArrayList<>();

	@GetMapping("/index")
	public String studentList(Model model) {
		model.addAttribute("getlist", getlist);
		return "index";
	}

	@PostMapping("/addname")
	public String addname(@RequestParam("postname") String postname) {
		getlist.add(postname);
		return "redirect:index";
	}
}
