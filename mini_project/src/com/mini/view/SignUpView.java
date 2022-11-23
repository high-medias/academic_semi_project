package com.mini.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.mini.controller.LoginController;
import com.mini.controller.SignUpController;

public class SignUpView {
	
	SignUpController suc = new SignUpController();
	LoginController lC = new LoginController();
	Scanner sc = new Scanner(System.in);
	private int menu;
	
	public void singUpMainView() {
		
		ClearScreen.ClearConsole();

		do {
			System.out.println(" =========  회원가입 및 로그인 메뉴 ======== ");
			System.out.println("1. 고객 전용 회원가입"); 
			System.out.println("2. 직원 전용 회원가입"); 
			System.out.println("0. 메인 메뉴");
			System.out.println(" ============================= ");
			System.out.println();
			System.out.print("메뉴를 입력하세요 : ");
			menu = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch(menu) {

				case 1: suc.registNewCustomer(inputCustomer()); break;
				case 2: suc.registNewMember(inputMember()); break;
				case 0: break;
	
				default: 
					System.out.println("다시 입력해주세요\n");
					break;
				}
		}while(menu != 0);

	}

	private static Map<String, String> inputCustomer() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디를 입력하세요 : ");
	    String id = sc.nextLine();
	    System.out.print("비밀번호를 입력하세요 : ");
	    String pwd = sc.nextLine();
	    System.out.print("이름을 입력하세요 : ");
	    String name = sc.nextLine();
	    System.out.print("성별을 입력하세요 (남:M/여:F) : ");
	    String gender = sc.nextLine().toUpperCase();
	    System.out.print("핸드폰 번호를 입력하세요 : ");
	    String phoneNumber = sc.nextLine();
	    
	    Map<String, String> parameter = new HashMap<>();
	    parameter.put("id", id);
	    parameter.put("pwd", pwd);
	    parameter.put("name", name);
	    parameter.put("gender", gender);
	    parameter.put("phoneNumber", phoneNumber);
		
		return parameter;
	}
	
	private static Map<String, String> inputMember() {
		
		Scanner sc = new Scanner(System.in);
		Map<String, String> parameter = new HashMap<>();
		
		System.out.print("사원번호를 입력하세요 : ");
		String no = sc.nextLine();
		System.out.print("이름을 입력하세요 : ");
	    String name = sc.nextLine();
	    System.out.print("나이를 입력하세요 : ");
	    String age = sc.nextLine();
	    System.out.print("성별을 입력하세요 (남:M/여:F) : ");
	    String gender = sc.nextLine().toUpperCase();
	    System.out.print("직급을 입력하세요 : ");
	    String position = sc.nextLine();
	    System.out.print("패스워드를 입력하세요 : ");
	    String pwd = sc.nextLine();
	    
	    parameter.put("no", no);
	    parameter.put("name", name);
	    parameter.put("age", age);
	    parameter.put("gender", gender);
		parameter.put("position", position);
		parameter.put("pwd", pwd);
	    
		return parameter;
	}
	
	
	
	
}
