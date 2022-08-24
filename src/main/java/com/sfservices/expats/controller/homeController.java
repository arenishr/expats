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


@RestController
public class homeController {
	
	@GetMapping("/")
    public String index() {
		System.out.println("in java");
        return "Home page";
    }
	
	@GetMapping("/api/test")
	@ResponseBody
    public ResponseEntity<?> test() {
		System.out.println("in java");
        return ResponseEntity.ok("success");
    }
	
	@GetMapping("/api/getjobs")
	@ResponseBody
    public ResponseEntity<?> getJobs() {
		System.out.println("fetching jobs in java");
        return ResponseEntity.ok("list the jobs success");
    }
	
	@GetMapping("/api/getcvs")
	@ResponseBody
    public ResponseEntity<?> getCVs() {
		System.out.println("fetching CVs in java");
        return ResponseEntity.ok("list the cvs success");
    }
	
	@PostMapping("/api/savejob")
	@ResponseBody
    public ResponseEntity<?> save(@RequestBody JobProfile rawdata) {
		System.out.println("data recieved");
        return ResponseEntity.ok("Job saved successfully");
    }
	
	@PostMapping("/api/savecv")
	@ResponseBody
    public ResponseEntity<?> saveCV(@RequestBody CV rawdata) {
		System.out.println("saveCV: data recieved");
        return ResponseEntity.ok("CV saved successfully");
    }

}
