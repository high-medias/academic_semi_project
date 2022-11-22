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
			System.out.println("2. 고객 로그인");
			System.out.println("3. 직원 로그인");
			System.out.println("0. 프로그램 종료");
			System.out.println(" ============================ \n");
			
			System.out.print("메뉴를 입력하세요 : ");
			num = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch(num) {
			case 1: break;
			case 2: loginController.checkLogin(CustomerinputLoginInfo()); break;
			case 3: loginController.checkLogin(MemberinputLoginInfo()); break;
			case 0:
				ClearScreen.ClearConsole();
				System.out.println(" ================ ");
				System.out.println("프로그램을 종료합니다.");
				System.out.println(" ================ ");
				System.out.println();
				break;
			}
		}while(num != 0);
		
	}


	private CustomerDTO CustomerinputLoginInfo() {
		
		String id;
		String pwd;
		
		System.out.println(" ============================ \n");
		System.out.print(" 고객의 아이디를 입력하세요 : ");
		id = sc.nextLine();
		
		System.out.println(" ============================ \n");
		System.out.print(" 고객의 패스워드를 입력하세요 : ");
		pwd = sc.nextLine();
		
		return new CustomerDTO(id, pwd);
	}
	
	private MemberDTO MemberinputLoginInfo() {
		
		String id;
		String pwd;
		
		System.out.println(" ============================ \n");
		System.out.print(" 직원의 회원번호를 입력하세요 : ");
		id = sc.nextLine();
		
		System.out.println(" ============================ \n");
		System.out.print(" 직원의 패스워드를 입력하세요 : ");
		pwd = sc.nextLine();
		
		return new MemberDTO(id, pwd);
	}
}
