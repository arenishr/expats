package com.sfservices.expats.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sfservices.expats.repository.CV;
import com.sfservices.expats.repository.CVRepository;
import com.sfservices.expats.repository.JobProfile;
import com.sfservices.expats.repository.JobRepository;

@RestController
public class homeController {

	@Autowired
	CVRepository cvrepo;
	
	@Autowired
	JobRepository jobrepo;

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
		try {
			List<JobProfile> jobList = new ArrayList<JobProfile>();
			jobrepo.findAll().forEach(jobList::add);

			if (jobList.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			System.out.println("list the jobs success");
			return new ResponseEntity<>(jobList, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/api/getcvs")
	@ResponseBody
	public ResponseEntity<?> getCVs() {
		System.out.println("fetching CVs in java");
		try {
			List<CV> cvList = new ArrayList<CV>();
			cvrepo.findAll().forEach(cvList::add);

			if (cvList.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			System.out.println("list the cvs success");
			return new ResponseEntity<>(cvList, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("/api/savejob")
	@ResponseBody
	public ResponseEntity<?> savejob(@RequestBody JobProfile rawdata) {
		System.out.println("savejob: data recieved");
		jobrepo.save(rawdata);
		return ResponseEntity.ok("Job saved successfully");
	}

	@PostMapping("/api/savecv")
	@ResponseBody
	public ResponseEntity<?> saveCV(@RequestBody CV rawdata) {
		System.out.println("saveCV: data recieved");
		cvrepo.save(rawdata);
		return ResponseEntity.ok("CV saved successfully");
	}

}
