package com.sfservices.expats.repository;

public class CV {
	
	//<!-- id 	name 	education_1 	education_2 	id_type 	id_no 	current_job 	experience 	skills 	languages  -->
	
	private int id;
	private String name;
	private String education_1;
	private String education_2;
	private String id_type;
	private String id_no;
	private String current_job;
	private String experience;
	private String skills;
	private String languages;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEducation_1() {
		return education_1;
	}
	public void setEducation_1(String education_1) {
		this.education_1 = education_1;
	}
	public String getEducation_2() {
		return education_2;
	}
	public void setEducation_2(String education_2) {
		this.education_2 = education_2;
	}
	public String getId_type() {
		return id_type;
	}
	public void setId_type(String id_type) {
		this.id_type = id_type;
	}
	public String getId_no() {
		return id_no;
	}
	public void setId_no(String id_no) {
		this.id_no = id_no;
	}
	public String getCurrent_job() {
		return current_job;
	}
	public void setCurrent_job(String current_job) {
		this.current_job = current_job;
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
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}
	
	

}
