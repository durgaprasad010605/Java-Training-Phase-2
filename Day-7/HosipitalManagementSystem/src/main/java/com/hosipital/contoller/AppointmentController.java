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

import com.hosipital.model.Appointment;
import com.hosipital.service.AppointmentService;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentService service;

    // ADD
    @PostMapping
    public Appointment add(@RequestBody Appointment a) {
        return service.add(a);
    }

    // GET ALL
    @GetMapping
    public List<Appointment> getALL() {
        return service.getALL();
    }

    // GET BY ID
    @GetMapping("/{id}")
    public Appointment getById(@PathVariable Long id) {
        return service.getById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Appointment update(
            @PathVariable Long id,
            @RequestBody Appointment a) {

        return service.update(id, a);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteAppointment(@PathVariable Long id) {
        return service.deleteAppointment(id);
    }
}