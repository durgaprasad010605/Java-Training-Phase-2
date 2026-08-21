package com.hosipital.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hosipital.model.Department;
import com.hosipital.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    // ADD
    @PostMapping
    public Department add(@RequestBody Department d) {
        return service.add(d);
    }

    // GET ALL
    @GetMapping
    public List<Department> getALL() {
        return service.getALL();
    }

    // GET BY ID
    @GetMapping("/{id}")
    public Department getById(@PathVariable Long id) {
        return service.getById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Department update(
            @PathVariable Long id,
            @RequestBody Department d) {

        return service.update(id, d);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteDepartment(@PathVariable Long id) {
        return service.deleteDepartment(id);
    }
}