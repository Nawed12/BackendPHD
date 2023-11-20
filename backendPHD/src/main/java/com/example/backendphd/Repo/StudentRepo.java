package com.example.backendphd.Repo;


import com.example.backendphd.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

    Optional<Student> findOneByEmailAndPassword(String email, String password);
    Student findByEmail(String email);

}
