package com.omeregedaldal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    // Rest Endpoint to verify the application is running
    @GetMapping
    public String helloWorld() {
        return "Hello World! Spring Boot is running.";
    }

}
