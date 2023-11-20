package com.example.backendphd.Service.impl;

import com.example.backendphd.Dto.LoginDTO;
import com.example.backendphd.Dto.StudentDTO;
import com.example.backendphd.Entity.Student;
import com.example.backendphd.Repo.StudentRepo;
import com.example.backendphd.Service.StudentService;
import com.example.backendphd.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class StudentIMPL implements StudentService {

    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public String addStudent(StudentDTO studentDTO) {
        Student student = new Student(
               studentDTO.getStudentid(),
               studentDTO.getName(),
               studentDTO.getMobile(),
                studentDTO.getEmail(),
               studentDTO.getCity(),
               studentDTO.getState(),
                studentDTO.getPincode(),
                studentDTO.getTenth(),
                studentDTO.getTwelveth(),
                studentDTO.getGraduation(),

                this.passwordEncoder.encode(studentDTO.getPassword())
        );
        studentRepo.save(student);
        return student.getName();
    }

    @Override
    public LoginResponse loginStudent(LoginDTO loginDTO) {

        String msg = "";
        Student student1 = studentRepo.findByEmail(loginDTO.getEmail());
        if (student1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = student1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<Student> employee = studentRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
                if (employee.isPresent()) {
                    return new LoginResponse("Login Success", true);
                } else {
                    return new LoginResponse("Login Failed", false);
                }
            } else {
                return new LoginResponse("password Not Match", false);
            }
        }else {
            return new LoginResponse("Email not exits", false);
        }

    }
}
