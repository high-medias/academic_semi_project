package com.mini.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.mini.controller.LoginController;
import com.mini.dto.CustomerDTO;
import com.mini.dto.MemberDTO;

public class LoginView {
	
	MemberDTO mem;
	LoginController loginController = new LoginController();
	Scanner sc = new Scanner(System.in);
	
	SignUpView suV = new SignUpView();

	
	public void loginMain() {
		int num;
		
		do{
			System.out.println(" ====== 로그인 화면 메뉴 ======");
			System.out.println("1. 회원 가입");
			System.out.println("2. 로그인");
			System.out.println("0. 프로그램 종료");
			System.out.println(" ============================ \n");
			
			System.out.print("메뉴를 입력하세요 : ");
			num = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch(num) {
			case 1: break;
			case 2: loginController.checkLogin(inputLoginInfo()); break;
			case 0:
				ClearScreen.ClearConsole();
				System.out.println(" ================ ");
				System.out.println("프로그램을 종료합니다.");
				System.out.println(" ================ ");
				System.out.println();
				mem = null;
				break;
			}
		}while(num != 0 && num != 2);
		
	}


	private CustomerDTO inputLoginInfo() {
		
		String id;
		String pwd;
		
		System.out.println(" ============================ \n");
		System.out.print("아이디를 입력하세요 : ");
		id = sc.nextLine();
		
		System.out.println(" ============================ \n");
		System.out.print("패스워드를 입력하세요 : ");
		pwd = sc.nextLine();
		
		return new CustomerDTO(id, pwd);
	}
}
