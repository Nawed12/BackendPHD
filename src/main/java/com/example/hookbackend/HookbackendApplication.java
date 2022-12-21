package com.example.hookbackend;

import com.example.hookbackend.model.Student;
import com.example.hookbackend.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HookbackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(HookbackendApplication.class, args);
    }


        @Autowired
        private StudentRepository studentRepository;

        @Override
        public void run (String...args) throws Exception {
		Student student = new Student();
		student.setFirstName("Ramesh");
		student.setLastName("Fadatare");
		student.setEmailId("ramesh@gmail.com");
		studentRepository.save(student);

		Student student1 = new Student();
		student1.setFirstName("John");
		student1.setLastName("Cena");
		student1.setEmailId("cena@gmail.com");
		studentRepository.save(student1);
        }
    }

