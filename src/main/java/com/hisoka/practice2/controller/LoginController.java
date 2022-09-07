package com.hisoka.practice2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    

    @RequestMapping(value="/login",method = {RequestMethod.GET,RequestMethod.POST})
    public String displayLoginPage(@RequestParam(value="error",required = false) String error, Model model)
    {
        String errorMessage=null;
        if (error!=null)
        {
            errorMessage="Username or password incorrect!!";
        }
        model.addAttribute("errorMessage",errorMessage);
        return "login.html";
    }
}
