package com.example.demo;

import com.example.demo.modules.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {



    public static void main(String[] args) {
        User u = new User();
        Long id = u.getId();
        SpringApplication.run(DemoApplication.class, args);
    }
}
