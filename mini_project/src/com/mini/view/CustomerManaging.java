package com.mini.view;
import java.util.Scanner;

import com.mini.controller.BucketController;
import com.mini.dto.CustomerDTO;
import com.mini.dto.MemberDTO;


public class CustomerManaging {
	
	int menu;
	Scanner sc = new Scanner(System.in);

	public void customerManagingMainView() {
		ClearScreen.ClearConsole();

		do {
			System.out.println(" ========= 회원 관리 메뉴 ======== ");
			System.out.println("1. 고객 전체 조회하기"); 
			System.out.println("0. 메인 메뉴");
			System.out.println(" ============================= ");
			System.out.println();
			System.out.print("메뉴를 입력하세요 : ");
			menu = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch(menu) {

				case 1: break;
				case 0: break;
	
				default: 
					System.out.println("다시 입력해주세요\n");
					break;
	
				}
		}while(menu != 0);

	}

}