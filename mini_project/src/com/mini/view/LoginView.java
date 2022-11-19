package com.mini.view;

import java.util.HashMap;
import java.util.Scanner;

import com.mini.controller.LoginController;
import com.mini.dto.MemberDTO;

public class LoginView {
	
	MemberDTO mem;
	LoginController lC = new LoginController();
	Scanner sc = new Scanner(System.in);
	
	SignUpView suV = new SignUpView();

	
	public MemberDTO loginMain() {
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
			case 2: break;
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
		
		return mem;
	}
}
