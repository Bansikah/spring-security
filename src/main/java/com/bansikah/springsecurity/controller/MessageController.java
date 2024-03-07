package com.bansikah.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/message")
    public String getMessage() {
        return "Hello World, I am Noel Draxler a software Engineer from Cameroon";
    }
}
