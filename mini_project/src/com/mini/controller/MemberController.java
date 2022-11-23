package com.mini.controller;

import java.util.Map;

import com.mini.dto.MemberDTO;
import com.mini.service.MemberService;

public class MemberController {

	private MemberService memberService = new MemberService();
	private PrintResult printResult = new PrintResult();
	
	public void registNewMember(Map<String, String> parameter) {
		
		String no = parameter.get("no");
		String name = parameter.get("name");
		int age = Integer.parseInt(parameter.get("age"));
		String gender = parameter.get("gender");
		String position = parameter.get("position");
		
		MemberDTO memList = new MemberDTO();
		memList.setNo(no);
		memList.setName(name);
		memList.setAge(age);
		memList.setGender(gender);
		memList.setPosition(position);

	    if(memberService.insertMember(memList)) {
	    	
	    	printResult.printSuccessMessage("insert");
	   
	    } else {
	    	
	    	printResult.printErrorMessage("insert");
	    }
		
		
		
		
	}

}
