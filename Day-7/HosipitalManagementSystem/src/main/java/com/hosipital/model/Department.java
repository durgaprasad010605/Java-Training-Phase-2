package com.hosipital.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Data
public class Department {
	
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long deptId;
	private String deptName;
	private String depLocation;
	
	/* 
	 * one department can has many doctors
	 * mappedby ="dept" means:- the doctor entity owns the relationship
	 * the actial foreign key is doctor
	 * department does not create departmentid 
	 * */
	
	
	@OneToMany(mappedBy = "dept",cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Doctor> doctor=new ArrayList<>();
	
	

}
