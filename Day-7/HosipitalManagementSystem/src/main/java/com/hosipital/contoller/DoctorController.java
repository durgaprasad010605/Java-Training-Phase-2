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

import com.hosipital.model.Doctor;
import com.hosipital.service.DoctorService;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorService service;

    // ADD
    @PostMapping
    public Doctor add(@RequestBody Doctor d) {
        return service.add(d);
    }

    // GET ALL
    @GetMapping
    public List<Doctor> getALL() {
        return service.getALL();
    }

    // GET BY ID
    @GetMapping("/{id}")
    public Doctor getById(@PathVariable Long id) {
        return service.getById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Doctor update(
            @PathVariable Long id,
            @RequestBody Doctor d) {

        return service.update(id, d);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteDoctor(@PathVariable Long id) {
        return service.deleteDoctor(id);
    }
}