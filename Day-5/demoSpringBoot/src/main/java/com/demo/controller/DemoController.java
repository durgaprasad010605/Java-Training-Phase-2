package com.demo.controller;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Student;

@RestController
public class DemoController {
	@GetMapping("/")
	public String hello() {
		return "rdp";
	
	}
	@GetMapping("/display")
	public String display() {
		return "101"+"suresh"+"aiml";
	}
	
	@GetMapping("/students")
		public List<Student> getStudent(){
			return List.of(
					new Student(101,"rdp","cse","rdp@gmail.com"),
					new Student(102,"rdp","cse","rdp@gmail.com"),
					new Student(103,"rdp","cse","rdp@gmail.com"),
					new Student(103,"rdp","cse","rdp@gmail.com")
					);
		}
	}
