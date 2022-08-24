package com.sfservices.expats.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class JobProfile {
	
	//<!-- id 	title 	sector 	qualification 	experience 	skills 	license 	salary 	remarks -->
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String title;
	private String sector;
	private String qualification;
	private String experience;
	private String skills;
	private String license;
	private String salary;
	private String remarks;
	
	
	protected JobProfile() {}

	  public JobProfile(String title, String qualification) {
	    this.title = title;
	    this.qualification = qualification;
	  }

	  @Override
	  public String toString() {
	    return String.format(
	        "The JobProfile is [id=%d, title='%s', qualification='%s']",
	        id, title, qualification);
	  }
	  
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	

}
