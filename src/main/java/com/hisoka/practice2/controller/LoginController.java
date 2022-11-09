package com.hisoka.practice2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    
     @GetMapping("/home")
     public String hello(){return "Hello From Service on ECS!!";}
}
