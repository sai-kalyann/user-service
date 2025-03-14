package com.kalyan.controller;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
//@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String HomeControllerHandler(){
        return "user microservice for salon booking system";
    }
}
