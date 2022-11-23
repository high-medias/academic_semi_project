package com.mini.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.mini.controller.LoginController;
import com.mini.controller.MemberController;
import com.mini.controller.SignUpController;

public class MemSignUpView {
	
	MemberController mbc = new MemberController();
	Scanner sc = new Scanner(System.in);
	LoginController lC = new LoginController();
	private int menu;
	
	public void memSignUpMainView() {
		
		ClearScreen.ClearConsole();

		do {
			System.out.println(" =========  회원가입 및 로그인 메뉴 ======== ");
			System.out.println("1. 로그인"); 
			System.out.println("2. 신규직원등록"); 
			System.out.println("0. 메인 메뉴");
			System.out.println(" ============================= ");
			System.out.println();
			System.out.print("메뉴를 입력하세요 : ");
			menu = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch(menu) {

				case 1: break;
				case 2: mbc.registNewMember(inputMember());break;
				case 0: break;
	
				default: 
					System.out.println("다시 입력해주세요\n");
					break;
	
				}
		}while(menu != 0);

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
	    
	    
	    parameter.put("no", no);
	    parameter.put("name", name);
	    parameter.put("age", age);
	    parameter.put("gender", gender);
		parameter.put("position", position);
	    
		return parameter;
	}
	
	
	
}
