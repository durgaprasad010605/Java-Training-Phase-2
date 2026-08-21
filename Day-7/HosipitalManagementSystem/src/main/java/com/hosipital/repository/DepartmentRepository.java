package com.hosipital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hosipital.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
