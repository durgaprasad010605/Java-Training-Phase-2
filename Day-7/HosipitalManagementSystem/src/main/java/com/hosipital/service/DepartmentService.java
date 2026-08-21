package com.hosipital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hosipital.model.Department;
import com.hosipital.repository.DepartmentRepository;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository drepo;

    // ADD DEPARTMENT
    public Department add(Department d) {
        return drepo.save(d);
    }

    // GET ALL DEPARTMENTS
    public List<Department> getALL() {
        return drepo.findAll();
    }

    // GET DEPARTMENT BY ID
    public Department getById(Long id) {
        return drepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Department not found"));
    }

    // UPDATE DEPARTMENT
    public Department update(Long id, Department d) {

        Department dd = getById(id);

        dd.setDeptName(d.getDeptName());
        dd.setDepLocation(d.getDepLocation());
        dd.setDoctor(d.getDoctor());

        return drepo.save(dd);
    }

    // DELETE DEPARTMENT
    public String deleteDepartment(Long id) {

        Department d = getById(id);

        drepo.delete(d);

        return "Department Deleted successfully";
    }
}