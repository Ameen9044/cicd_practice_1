package com.hisoka.practice2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class LoginController {
    
     @GetMapping("/home")
     public String hello(){return "Hello From Service on ECS!!";}
}
