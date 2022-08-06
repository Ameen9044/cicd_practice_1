package com.hisoka.practice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class Practice2Application {

	public static void main(String[] args) {
		SpringApplication.run(Practice2Application.class, args);
	}

	@RequestMapping("/home")
	public String displayHomePage(Model model, Authentication authentication) {
		model.addAttribute("username", authentication.getName());
		model.addAttribute("roles", authentication.getAuthorities().toString());
		return "home.html";
	}

}
