package com.hosipital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hosipital.model.Prescription;

public interface PrescriptionRepository extends JpaRepository<Prescription, Long>{

}
