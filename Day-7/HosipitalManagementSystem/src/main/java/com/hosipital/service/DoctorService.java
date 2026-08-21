package com.hosipital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hosipital.model.Doctor;
import com.hosipital.repository.DoctorRepository;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository dctrepo;

    // ADD DOCTOR
    public Doctor add(Doctor d) {
        return dctrepo.save(d);
    }

    // GET ALL DOCTORS
    public List<Doctor> getALL() {
        return dctrepo.findAll();
    }

    // GET DOCTOR BY ID
    public Doctor getById(Long id) {
        return dctrepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Doctor not found"));
    }

    // UPDATE DOCTOR
    public Doctor update(Long id, Doctor d) {

        Doctor dd = getById(id);

        dd.setDoctorName(d.getDoctorName());
        dd.setDept(d.getDept());
        dd.setAppointment(d.getAppointment());
        dd.setSpecialities(d.getSpecialities());

        return dctrepo.save(dd);
    }

    // DELETE DOCTOR
    public String deleteDoctor(Long id) {

        Doctor d = getById(id);

        dctrepo.delete(d);

        return "Doctor Deleted successfully";
    }
}