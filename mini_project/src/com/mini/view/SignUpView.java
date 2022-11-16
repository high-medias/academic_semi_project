package com.mini.view;

import java.util.Scanner;

import com.mini.controller.LoginController;
import com.mini.controller.SignUpController;

public class SignUpView {
	
	SignUpController suc = new SignUpController();
	Scanner sc = new Scanner(System.in);
	LoginController lC = new LoginController();
	
	public void singUpMainView() {
		
		String id;
		String pwd1;
		String pwd2;
		
		System.out.println(" ===================== ");
		System.out.println(" ****   회원가입   ****");
		System.out.println(" ===================== ");
		System.out.println();
		
		System.out.println();
		System.out.println(" ================== ");
		System.out.print("  아이디를 입력하세요 : ");
		id = sc.nextLine();
		System.out.println();

		while(suc.checkId(id)){
			
			ClearScreen.ClearConsole();
			System.out.println("     ===================== ");
			System.out.println(" ****  ID가 이미 존재합니다. ****");
			System.out.println(" ****  ID를 다시 입력하세요.  ****");
			System.out.println("     ===================== ");
			
			System.out.println();
			System.out.println(" ================== ");
			System.out.print("  아이디를 입력하세요 : ");
			id = sc.nextLine();
			System.out.println();
			
		}
		
		System.out.println(" ================== ");
		System.out.println("  비밀번호를 입력하세요 : ");
		pwd1 = sc.nextLine();
		System.out.println(" ================== ");
		System.out.println("  비밀번호를 다시 입력하세요 : ");
		pwd2 = sc.nextLine();
		System.out.println();
		
		
		while(!suc.checkPwd(pwd1, pwd2)){
			
			ClearScreen.ClearConsole();
			System.out.println("     ===================== ");
			System.out.println(" ****  PWD가 서로 다릅니다. ****");
			System.out.println(" ****  PWD를 다시 입력하세요.  ****");
			System.out.println("     ===================== ");
			System.out.println();
			
			
			System.out.println(" ================== ");
			System.out.println("  비밀번호를 입력하세요 : ");
			pwd1 = sc.nextLine();
			System.out.println(" ================== ");
			System.out.println("  비밀번호를 다시 입력하세요 : ");
			pwd2 = sc.nextLine();
			System.out.println();
			
		}
		
		suc.insertMember(id, pwd2);
		
		System.out.println(" ======================== ");
		System.out.println(" = 회원가입이 완료 되었습니다. = ");
		System.out.println(" ======================== ");
		System.out.println();
		System.out.println();
		
	}
}
