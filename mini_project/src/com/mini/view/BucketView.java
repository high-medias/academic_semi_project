package com.mini.view;
import java.util.Scanner;

import com.mini.controller.BucketController;
import com.mini.dto.CustomerDTO;
import com.mini.dto.MemberDTO;


public class BucketView {
	
	int menu;
	Scanner sc = new Scanner(System.in);
	BucketController bC = new BucketController();

	public void BucketMainView(CustomerDTO cus) {
		ClearScreen.ClearConsole();
		
		//현재 임시 객체의 customer의 PK는 CUS_ID이고 값은 "user01"입니다.
		
		do {
			System.out.println(" ========= 장바구니 메뉴 ======== ");
			System.out.println("1. 나의 장바구니 조회"); 
			System.out.println("2. 나의 장바구니의 담긴 금액 확인");
			System.out.println("3. 장바구니 상품 삭제");
			System.out.println("4. 장바구니 비우기");
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
				case 3: break;
				case 4: break;
				case 0: break;
	
				default: 
					System.out.println("다시 입력해주세요\n");
					break;
	
				}
		}while(menu != 0);

	}

}