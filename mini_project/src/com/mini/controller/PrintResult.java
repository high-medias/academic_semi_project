package com.mini.controller;


import java.util.List;

import com.mini.dto.CustomerDTO;

public class PrintResult {

	/*
	public void printMenuList(List<MenuDTO> menuList) {
		for(MenuDTO menu : menuList) {
			System.out.println(menu);
		}
	}*/
	
	public void printMenuList(List<CustomerDTO> cusList) {
		for(CustomerDTO customer : cusList) {
			System.out.println(customer);
		}
	}
	
	/*
	public void printMenu(MenuDTO menu) {
		System.out.println(menu);
	}
	*/
	
	public void printSuccessMessage(String successCode) {
		
		String successMessage = "";
		switch(successCode) {
			case "insert" : successMessage = "신규 회원 등록에 성공하셨습니다."; break;
			case "update" : successMessage = "회원 정보 수정에 성공하셨습니다."; break;
			case "delete" : successMessage = "메뉴 삭제에 성공하셨습니다."; break;
		}
		
		System.out.println(successMessage);
		
	}
	
	public void printErrorMessage(String errorCode) {
		
		String errorMessage = "";
		switch(errorCode) {
			case "selectList" : errorCode = "메뉴 목록 조회에 실패하셨습니다."; break;
			case "selectOne" : errorCode = "메뉴 조회에 실패하셨습니다."; break;
			case "insert" : errorCode = "신규 메뉴 등록에 실패하셨습니다."; break;
			case "update" : errorCode = "메뉴 수정에 실패하셨습니다."; break;
			case "delete" : errorCode = "메뉴 삭제에 실패하셨습니다."; break;
		}
		
		System.out.println(errorMessage);
		
	}
}
