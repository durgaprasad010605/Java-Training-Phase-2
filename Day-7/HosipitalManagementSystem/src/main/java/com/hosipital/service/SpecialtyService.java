package com.hosipital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hosipital.model.Specialty;
import com.hosipital.repository.SpecialtyRepsoitory;

@Service
public class SpecialtyService {

    @Autowired
    private SpecialtyRepsoitory srepo;

    // ADD SPECIALTY
    public Specialty add(Specialty s) {
        return srepo.save(s);
    }

    // GET ALL SPECIALTIES
    public List<Specialty> getALL() {
        return srepo.findAll();
    }

    // GET SPECIALTY BY ID
    public Specialty getById(Long id) {
        return srepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Specialty not found"));
    }

    // UPDATE SPECIALTY
    public Specialty update(Long id, Specialty s) {

        Specialty ss = getById(id);

        ss.setName(s.getName());
        ss.setDoctor(s.getDoctor());

        return srepo.save(ss);
    }

    // DELETE SPECIALTY
    public String deleteSpecialty(Long id) {

        Specialty s = getById(id);

        srepo.delete(s);

        return "Specialty Deleted successfully";
    }
}