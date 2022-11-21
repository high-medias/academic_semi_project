package com.mini.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import com.mini.dto.CustomerDTO;
import com.mini.service.CustomerService;

public class SignUpController {
	
	
	private PrintResult printResult = new PrintResult();
	private CustomerService customerService  = new CustomerService();
	
	
	LoginController lC = new LoginController();
	HashMap<String, String> members = lC.memberInquiry();
//	private Object customerService;
	
	public boolean checkId(String id) {
		return members.containsKey(id);
		
	}
	
	public boolean checkPwd(String pwd1, String pwd2) {
		
		// 1 : 패스워드 같음 ok,  0 : 패스워드가 다름 no
		return pwd1.equals(pwd2);
	}
	
	public void insertMember(String id, String pwd) {
		try {
			OutputStream out = new FileOutputStream("./src/member.txt", true);
			
			try {
				out.write(("\n" + id + " " + pwd).getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

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
	    
	    if(customerService.insertCustomer(cusList)) {
   
	    	printResult.printSuccessMessage("insert");
	    	
	    } else {
	    	
	    	printResult.printErrorMessage("insert");
	    }
	    
	}

}
