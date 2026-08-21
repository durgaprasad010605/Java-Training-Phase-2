package com.hosipital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hosipital.model.Prescription;
import com.hosipital.repository.PrescriptionRepository;

@Service
public class PrescriptionService {

    @Autowired
    private PrescriptionRepository prepo;

    // ADD PRESCRIPTION
    public Prescription add(Prescription p) {
        return prepo.save(p);
    }

    // GET ALL PRESCRIPTIONS
    public List<Prescription> getALL() {
        return prepo.findAll();
    }

    // GET PRESCRIPTION BY ID
    public Prescription getById(Long id) {
        return prepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Prescription not found"));
    }

    // UPDATE PRESCRIPTION
    public Prescription update(Long id, Prescription p) {

        Prescription pp = getById(id);

        pp.setMedicine(p.getMedicine());
        pp.setDosage(p.getDosage());
        pp.setAppointment(p.getAppointment());

        return prepo.save(pp);
    }

    // DELETE PRESCRIPTION
    public String deletePrescription(Long id) {

        Prescription p = getById(id);

        prepo.delete(p);

        return "Prescription Deleted successfully";
    }
}