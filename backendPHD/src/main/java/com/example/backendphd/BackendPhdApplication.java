package com.example.backendphd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class BackendPhdApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendPhdApplication.class, args);
    }

}
