package com.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emp.model.Emp;
import com.emp.services.EmpService;

@RestController("/emp")
@RequestMapping
public class EmpContoller {
	
	@Autowired
	private EmpService service;
	
	@PostMapping("/add")
	public Emp addEmp(@RequestBody Emp e) {
		service.addEmp(e);
		return e;
	}
	
	@GetMapping("/getall")
	public List<Emp> getAll(){
		return service.getAll();
	}
	@GetMapping("/getbyid/{id}")
	public Emp getById(@PathVariable  Long id) {
		return service.getById(id);
	}
	@PutMapping("/update/{id}")
	public Emp updateEmp(@PathVariable Long id,@RequestBody Emp e){
		return service.updateEmp(id,e);
		
	}
	@DeleteMapping("/delete/{id}")
	public String deleteEmp(@PathVariable Long id) {
		return service.deleteEmp(id);
	}
	@GetMapping("/name/{name}")
	public List<Emp> getByName(@RequestParam String name) {
		return service.getByName(name);
		
	}
}
