package com.example.serviceB.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ServiceBController {


    @GetMapping("/taskB")
    public String performTaskB() {
        return "Response from ServiceB";
    }

}
