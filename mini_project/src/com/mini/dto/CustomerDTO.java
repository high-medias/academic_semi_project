package com.mini.dto;

public class CustomerDTO {
	
	String id;
	String pwd;
	String name;
	String gender;
	String phoneNumber;
	String grade;
	
	public CustomerDTO() {}
	
	public CustomerDTO(String id, String pwd, String name, String gender, String phoneNumber, String grade) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.grade = grade;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "customerDTO [id=" + id
				+ ", pwd=" + pwd
				+ ", name=" + name
				+ ", gender=" + gender
				+ ", phoneNumber=" + phoneNumber
				+ ", grade=" + grade + "]";
	}
	
	
	
}
