package com.mini.dto;

import java.util.ArrayList;
import java.util.Date;

// 직원 Table과 연동 //
// 		고객이 아님! //
public class MemberDTO {
	
	String no;
	String name;
	int age;
	String gender;
	String position;
	Date hireDate;
	String managerNo;
	String pwd;
	
	public MemberDTO() {}
	
	public MemberDTO(String no, String pwd) {
		this.no = no;
		this.pwd = pwd;
	}
	
	public MemberDTO(String no, String name, int age, 
			String gender, String position, Date hireDate, 
			String managerNo) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.position = position;
		this.hireDate = hireDate;
		this.managerNo = managerNo;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getManagerNo() {
		return managerNo;
	}

	public void setManagerNo(String managerNo) {
		this.managerNo = managerNo;
	}

	@Override
	public String toString() {
		return "MemberDTO [no=" + no 
				+ ", name=" + name
				+ ", age=" + age
				+ ", gender=" + gender
				+ ", position=" + position 
				+ ", hireDate=" + hireDate
				+ ", managerNo=" + managerNo + "]";
	}
	
	
	
	
}
