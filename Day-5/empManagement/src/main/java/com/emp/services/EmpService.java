package com.emp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.controller.*;
import com.emp.model.Emp;
import com.emp.repository.EmpRepo;

@Service
public class EmpService {
	@Autowired
	private EmpRepo repo;

	public void addEmp(Emp e) {
		repo.save(e);
	}

	public List<Emp> getAll() {
		repo.findAll();
		// TODO Auto-generated method stub
		return null;
	}

	public Emp getById(Long id) {
		return repo.findById(id).orElseThrow(()-> new RuntimeException("Emp not found"));
	}

	public Emp updateEmp(Long id, Emp e) {
		Emp ee=getById(id);
		ee.setName(e.getName());
		ee.setDesg(e.getDesg());
		ee.setSalary(e.getSalary());
		return repo.save(ee);
	}

	public String deleteEmp(Long id) {
		Emp e=getById(id);
		repo.delete(e);
		return "Emp id deleted succesfully";
	}

	public List<Emp> getByName(String name) {
		return repo.findByName(name);
		
	}
}
