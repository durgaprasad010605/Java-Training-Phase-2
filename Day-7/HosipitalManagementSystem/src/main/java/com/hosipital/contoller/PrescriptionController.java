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

import com.hosipital.model.Prescription;
import com.hosipital.service.PrescriptionService;

@RestController
@RequestMapping("/prescriptions")
public class PrescriptionController {

    @Autowired
    private PrescriptionService service;

    // ADD
    @PostMapping
    public Prescription add(@RequestBody Prescription p) {
        return service.add(p);
    }

    // GET ALL
    @GetMapping
    public List<Prescription> getALL() {
        return service.getALL();
    }

    // GET BY ID
    @GetMapping("/{id}")
    public Prescription getById(@PathVariable Long id) {
        return service.getById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Prescription update(
            @PathVariable Long id,
            @RequestBody Prescription p) {

        return service.update(id, p);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deletePrescription(@PathVariable Long id) {
        return service.deletePrescription(id);
    }
}