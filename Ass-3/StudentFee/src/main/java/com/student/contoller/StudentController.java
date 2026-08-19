package com.student.contoller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.student.model.Student;
import com.student.repository.StudentRepository;

@RestController
@RequestMapping("/students")
public class StudentController {

    private StudentRepository repository;

    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return repository.save(student);
    }

    @GetMapping
    public List<Student> getStudents() {
        return repository.findAll();
    }
}