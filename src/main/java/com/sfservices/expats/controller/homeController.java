package com.sfservices.expats.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sfservices.expats.repository.CV;
import com.sfservices.expats.repository.JobProfile;

@CrossOrigin(origins = "*")
@RestController
public class homeController {
	
	@GetMapping("/")
    public String index() {
		System.out.println("in java");
        return "Home page";
    }
	
	@GetMapping("/api/test")
	@ResponseBody
    public ResponseEntity<String> test() {
		System.out.println("in java");
        return ResponseEntity.ok("success");
    }
	
	@PostMapping("/savejob")
	@ResponseBody
    public ResponseEntity<String> save(@RequestBody JobProfile rawdata) {
		System.out.println("data recieved");
        return ResponseEntity.ok("Job saved successfully");
    }
	
	@PostMapping("/savecv")
	@ResponseBody
    public ResponseEntity<String> saveCV(@RequestBody CV rawdata) {
		System.out.println("savejob: data recieved");
        return ResponseEntity.ok("Job saved successfully");
    }

}
