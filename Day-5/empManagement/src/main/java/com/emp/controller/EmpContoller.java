package com.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.model.Emp;
import com.emp.services.EmpService;

@RestController("/emp")
public class EmpContoller {
	
	@Autowired
	private EmpService service;
	
	@PostMapping("/add")
	public Emp addEmp(Emp e) {
		service.addEmp(e);
		return e;
	}
	
	@GetMapping("/getall")
	public List<Emp> getAll(){
		return service.getAll();
	}
	
	

}
