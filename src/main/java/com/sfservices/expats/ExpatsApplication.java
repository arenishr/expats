package com.sfservices.expats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
public class ExpatsApplication {

	public static void main(String[] args) {
		System.out.println("Initialised boot app");
		SpringApplication.run(ExpatsApplication.class, args);
	}
	
	
}
