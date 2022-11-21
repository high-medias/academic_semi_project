package com.mini.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.mini.controller.LoginController;
import com.mini.controller.SignUpController;

public class SignUpView {
	
	SignUpController suc = new SignUpController();
	Scanner sc = new Scanner(System.in);
	LoginController lC = new LoginController();
	private int menu;
	
	public void singUpMainView() {
		
		ClearScreen.ClearConsole();

		do {
			System.out.println(" =========  회원가입 및 로그인 메뉴 ======== ");
			System.out.println("1. 회원가입"); 
			System.out.println("2. 로그인"); 
			System.out.println("0. 메인 메뉴");
			System.out.println(" ============================= ");
			System.out.println();
			System.out.print("메뉴를 입력하세요 : ");
			menu = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch(menu) {

				case 1: suc.registNewCustomer(inputCustomer()); break;
				case 2: break;
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
	
	
	
}
