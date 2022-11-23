package com.mini.view;

import java.util.Scanner;

import com.mini.dto.MemberDTO;

public class mainView {
	Scanner sc = new Scanner(System.in);
	LoginView login = new LoginView();
	SignUpView signUp = new SignUpView();
	
	public void mainViews() {
		
		int num;	
		do
		{
	        
			System.out.println(" ====== 로그인 & 회원가입 선택 메뉴 ======");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인"); 
			System.out.println("0. 프로그램 종료");
			System.out.println(" =========================== \n");
			
			System.out.print("메뉴를 입력하세요 : ");
			
			System.out.println();
			num = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch(num) {
			case 1: signUp.singUpMainView(); break;
			case 2: login.loginMain(); break;
			case 0:
				ClearScreen.ClearConsole();
				System.out.println(" ================ ");
				System.out.println("프로그램을 종료합니다.");
				System.out.println(" ================ ");
				break;
			}
			
		}while(num != 0);
	}
	
}
