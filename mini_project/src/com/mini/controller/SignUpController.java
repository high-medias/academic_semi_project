package com.mini.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.mini.dto.CustomerDTO;
import com.mini.dto.MemberDTO;
import com.mini.service.CustomerService;
import com.mini.service.MemberService;

public class SignUpController {
	
	
	private PrintResult printResult = new PrintResult();
	private CustomerService customerService  = new CustomerService();
	private MemberService memberService = new MemberService();
	
	
	LoginController lC = new LoginController();
	HashMap<String, String> members = null;


	public void registNewCustomer(Map<String, String> parameter) {
		
		String id = parameter.get("id");
		String pwd = parameter.get("pwd");
		String name = parameter.get("name");
		String gender = parameter.get("gender");
	    String phoneNumber = parameter.get("phoneNumber");
	    
	    CustomerDTO cusList = new CustomerDTO();
	    cusList.setId(id);
	    cusList.setPwd(pwd);
	    cusList.setName(name);
	    cusList.setGender(gender);
	    cusList.setPhoneNumber(phoneNumber);
	    cusList.setGrade("1");
	    
	    if(customerService.insertCustomer(cusList)) {
   
	    	printResult.printSuccessMessage("insert");
	    	
	    } else {
	    	
	    	printResult.printErrorMessage("insert");
	    }
	}
	
	public void registNewMember(Map<String, String> parameter) {
		
		String no = parameter.get("no");
		String name = parameter.get("name");
		String age = parameter.get("age");
		String gender = parameter.get("gender");
		String position = parameter.get("position");
		String managerNo = parameter.get("managerNo");
		String pwd = parameter.get("pwd");
		
		MemberDTO memList = new MemberDTO();
		memList.setNo(no);
		memList.setName(name);
		memList.setAge(age);
		memList.setGender(gender);
		memList.setPosition(position);
		memList.setPwd(pwd);
		
	    if(memberService.insertMember(memList)) {
	    	
	    	printResult.printSuccessMessage("insert");
	   
	    } else {
	    	
	    	printResult.printErrorMessage("insert");
	    }	
	}
}
