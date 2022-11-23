package com.mini.view;

import java.util.Scanner;

import com.mini.controller.CustomerController;
import com.mini.dto.MemberDTO;
import com.mini.dto.ProductDTO;

public class OliveMemberMenu {
	
	MemberDTO mem;
	private Scanner sc = new Scanner(System.in);
	
	CustomerController customerController = new CustomerController();
	
	CustomerManaging customerManaging = new CustomerManaging();
	SignUpView signUpView = new SignUpView();
	ProductView productView = new ProductView();
	
	private int num;
	
	public int OliveMainMenu(MemberDTO mem) {
		
		this.mem = mem;
		
		do
		{
	        
			System.out.println(" ====== Olive 관리자 메인 메뉴 ======");
			
			System.out.println("1. 상품 관리 메뉴");
			System.out.println("0. 로그아웃");
			System.out.println(" =========================== \n");
			
			System.out.print("메뉴를 입력하세요 : ");
			
			System.out.println();
			num = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch(num) {
			case 1: productView.ProductMangagement(); break;
			case 0:
				ClearScreen.ClearConsole();
				break;
			}
			
		}while(num != 0);
		
		return 0;
	}
	
}
