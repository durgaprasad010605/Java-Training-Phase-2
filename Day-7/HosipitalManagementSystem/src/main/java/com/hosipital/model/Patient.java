package com.hosipital.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String patientName;
	private Integer patientAge;
	private String phone;
	@OneToMany(mappedBy = "patient",cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Appointment> appointments=new ArrayList<>();
	
	
	
	

}
