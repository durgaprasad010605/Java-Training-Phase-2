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


}
