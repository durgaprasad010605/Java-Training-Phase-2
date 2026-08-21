package com.hosipital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hosipital.model.Doctor;


public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
