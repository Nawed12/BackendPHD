package com.example.hookbackend.controller;
import com.example.hookbackend.model.Student;
import com.example.hookbackend.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/employees")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public List<Student> getAllEmployees(){
        return studentRepository.findAll();
    }


}