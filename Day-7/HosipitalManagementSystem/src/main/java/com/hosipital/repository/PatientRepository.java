package com.hosipital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hosipital.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
