package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/")
    public String home(){
        return "Hello World";
    }
    @GetMapping("/users")
    public String getUsers(){
        return "users";
    }
}
