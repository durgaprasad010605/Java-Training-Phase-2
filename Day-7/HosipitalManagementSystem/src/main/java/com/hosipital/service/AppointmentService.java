package com.hosipital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hosipital.model.Appointment;
import com.hosipital.repository.AppointmentRepository;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository arepo;

    // ADD APPOINTMENT
    public Appointment add(Appointment a) {
        return arepo.save(a);
    }

    // GET ALL APPOINTMENTS
    public List<Appointment> getALL() {
        return arepo.findAll();
    }

    // GET APPOINTMENT BY ID
    public Appointment getById(Long id) {
        return arepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Appointment not found"));
    }

    // UPDATE APPOINTMENT
    public Appointment update(Long id, Appointment a) {

        Appointment aa = getById(id);

        aa.setAppointmentDate(a.getAppointmentDate());
        aa.setPatient(a.getPatient());
        aa.setDoctor(a.getDoctor());
        aa.setPrescription(a.getPrescription());

        return arepo.save(aa);
    }

    // DELETE APPOINTMENT
    public String deleteAppointment(Long id) {

        Appointment a = getById(id);

        arepo.delete(a);

        return "Appointment Deleted successfully";
    }
}