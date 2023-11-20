package com.example.backendphd.Controller;


import com.example.backendphd.Dto.LoginDTO;
import com.example.backendphd.Dto.StudentDTO;
import com.example.backendphd.Service.StudentService;
import com.example.backendphd.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/student")

public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping(path = "/save")
    public String saveStudent(@RequestBody StudentDTO studentDTO)
    {
        String id = studentService.addStudent(studentDTO);
        return id;
    }

    @PostMapping(path = "/login")
    public ResponseEntity<?> loginStudent(@RequestBody LoginDTO loginDTO)
    {
        LoginResponse loginResponse = studentService.loginStudent(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }
}
