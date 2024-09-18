package com.example.serviceA.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceAController {

    @GetMapping("/taskA")
    public String performTaskA(){
        return "Service A is performing its task";
    }
}
