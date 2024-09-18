package com.example.serviceC.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServiceCController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/taskC")
    public String performTaskC(){

        String taskA = restTemplate.getForObject("http://localhost:8084/taskA" , String.class);
        String taskB = restTemplate.getForObject("http://localhost:8085/taskB" , String.class);

        return "Service C is performing its task. \n" +taskA + "\n" +taskB;
    }
}
