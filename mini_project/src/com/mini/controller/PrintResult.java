package com.mini.controller;


import java.util.List;

import com.mini.dto.*;
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
	
	
	//구매 조회 HS
	public void printProductList(List<ProductDTO> pList) {
		for(ProductDTO Product : pList) {
			System.out.println(Product);
		}
	}
	
	
	//관리자 조회 HS
	public void printProductList2(List<ProductAndMemberDTO> pmList) {
		for(ProductAndMemberDTO Product : pmList) {
			System.out.println(Product);
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
			case "purchase" : successMessage = "구매 완료 했습니다."; break; //HS
			case "insert" : successMessage = "신규 회원 등록에 성공하셨습니다."; break;
			case "update" : successMessage = "회원 정보 수정에 성공하셨습니다."; break;
			case "delete" : successMessage = "회원 삭제에 성공하셨습니다."; break;
		}
		
		System.out.println(successMessage);
		
	}
	
	public void printErrorMessage(String errorCode) {
		
		String errorMessage = "";
		switch(errorCode) {
			case "selectList" : errorCode = "메뉴 목록 조회에 실패하셨습니다."; break;
			case "selectOne" : errorCode = "메뉴 조회에 실패하셨습니다."; break;
			case "insert" : errorCode = "신규 회원 등록에 실패하셨습니다."; break;
			case "update" : errorCode = "회원 수정에 실패하셨습니다."; break;
			case "delete" : errorCode = "회원 삭제에 실패하셨습니다."; break;
		}
		
		System.out.println(errorMessage);
		
	}
}
