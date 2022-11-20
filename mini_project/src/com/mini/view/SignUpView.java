package com.mini.view;

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

				case 1: break;
				case 2: break;
				case 0: break;
	
				default: 
					System.out.println("다시 입력해주세요\n");
					break;
	
				}
		}while(menu != 0);

	}
	
}
