package com.hosipital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hosipital.model.Patient;
import com.hosipital.repository.PatientRepository;

@Service
public class PatientService {

    @Autowired
    private PatientRepository prepo;

    // ADD PATIENT
    public Patient add(Patient p) {
        return prepo.save(p);
    }

    // GET ALL PATIENTS
    public List<Patient> getALL() {
        return prepo.findAll();
    }

    // GET PATIENT BY ID
    public Patient getById(Long id) {
        return prepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found"));
    }

    // UPDATE PATIENT
    public Patient update(Long id, Patient p) {

        Patient pp = getById(id);

        pp.setPatientName(p.getPatientName());
        pp.setPatientAge(p.getPatientAge());
        pp.setPhone(p.getPhone());
        pp.setAppointments(p.getAppointments());

        return prepo.save(pp);
    }

    // DELETE PATIENT
    public String deletePatient(Long id) {

        Patient p = getById(id);

        prepo.delete(p);

        return "Patient Deleted successfully";
    }
}