package com.sfservices.expats.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class loginController {

	
	@GetMapping("/login")
    public String index() {

        return "Login page";
    }
	
}
