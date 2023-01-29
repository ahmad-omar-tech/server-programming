package com.example.hellothymeleaf.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.exrecise.domain.Student;

import org.springframework.ui.Model;
@Controller
public class ExerciseController {
	
	@GetMapping("/studentlist")
    public String studentList(Model model) {
        List<Student> students = Arrays.asList(new Student("Kate","Cole"), new Student("Dan","Brown"), new Student("Mike","Mars"));
        model.addAttribute("students", students);
        return "studentlist";
	}
}
