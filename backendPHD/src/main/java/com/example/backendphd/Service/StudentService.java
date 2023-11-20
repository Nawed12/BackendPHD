package com.example.backendphd.Service;

import com.example.backendphd.Dto.LoginDTO;
import com.example.backendphd.Dto.StudentDTO;
import com.example.backendphd.response.LoginResponse;

public interface StudentService {
    String addStudent(StudentDTO studentDTO);

    LoginResponse loginStudent(LoginDTO loginDTO);
}
