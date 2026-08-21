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

import com.hosipital.model.Specialty;
import com.hosipital.service.SpecialtyService;

@RestController
@RequestMapping("/specialties")
public class SpecialtyController {

    @Autowired
    private SpecialtyService service;

    // ADD
    @PostMapping
    public Specialty add(@RequestBody Specialty s) {
        return service.add(s);
    }

    // GET ALL
    @GetMapping
    public List<Specialty> getALL() {
        return service.getALL();
    }

    // GET BY ID
    @GetMapping("/{id}")
    public Specialty getById(@PathVariable Long id) {
        return service.getById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Specialty update(
            @PathVariable Long id,
            @RequestBody Specialty s) {

        return service.update(id, s);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteSpecialty(@PathVariable Long id) {
        return service.deleteSpecialty(id);
    }
}