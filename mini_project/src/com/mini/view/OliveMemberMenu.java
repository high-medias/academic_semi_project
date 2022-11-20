package com.mini.view;

import java.util.Scanner;

import com.mini.controller.CustomerController;
import com.mini.dto.MemberDTO;
import com.mini.dto.ProductDTO;

public class OliveMemberMenu {
	
	MemberDTO mem;
	private Scanner sc = new Scanner(System.in);
	
	CustomerManaging customerManaging = new CustomerManaging();
	SignUpView signUpView = new SignUpView();
	
	private int num;
	
	public int OliveMainMenu(MemberDTO mem) {
		
		this.mem = mem;
		
		do
		{
	        
			System.out.println(" ====== Olive 관리자 메인 메뉴 ======");
			
			// JS --> 여기 추후 클래스 이동 예정
			System.out.println("1. 회원가입 및 로그인 메뉴");
			//MJ
			System.out.println("2. 고객 메뉴"); // 여기는 일단 패스!
			// KNY
			System.out.println("3. 회원 관리 메뉴");
			System.out.println("0. 프로그램 종료");
			System.out.println(" =========================== \n");
			
			System.out.print("메뉴를 입력하세요 : ");
			
			System.out.println();
			num = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			/*
			 * 
			 * 각 View에 들어가시면 구현해야할 기능에 대한 내용을 잡아 놓았습니다
			 * 이해 안되시면 톡주시면 말씀드리겠습니다.
			 *  고생하십쇼! :)
			 */
			switch(num) {
			case 1: break;
			case 2: signUpView.singUpMainView(); ;break;
			case 3: customerManaging.customerManagingMainView(); break;
			case 0:
				ClearScreen.ClearConsole();
				System.out.println(" ================ ");
				System.out.println("프로그램을 종료합니다.");
				System.out.println(" ================ ");
				break;
			}
			
		}while(num != 0);
		
		return 0;
	}
	
}
