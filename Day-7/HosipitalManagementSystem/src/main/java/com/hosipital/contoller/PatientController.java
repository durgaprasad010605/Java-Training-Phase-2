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

import com.hosipital.model.Patient;
import com.hosipital.service.PatientService;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService service;

    // ADD
    @PostMapping
    public Patient add(@RequestBody Patient p) {
        return service.add(p);
    }

    // GET ALL
    @GetMapping
    public List<Patient> getALL() {
        return service.getALL();
    }

    // GET BY ID
    @GetMapping("/{id}")
    public Patient getById(@PathVariable Long id) {
        return service.getById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Patient update(
            @PathVariable Long id,
            @RequestBody Patient p) {

        return service.update(id, p);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deletePatient(@PathVariable Long id) {
        return service.deletePatient(id);
    }
}