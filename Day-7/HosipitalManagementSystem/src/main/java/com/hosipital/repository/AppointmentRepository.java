package com.hosipital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hosipital.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
