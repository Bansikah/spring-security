package com.bansikah.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/student")
    public String getMessage() {
        return "Hello World, I am a Student at Adorsys";
    }
}
