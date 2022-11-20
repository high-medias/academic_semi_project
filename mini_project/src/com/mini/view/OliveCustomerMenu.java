package com.mini.view;

import java.util.Scanner;

import com.mini.controller.CustomerController;
import com.mini.dto.CustomerDTO;
import com.mini.dto.MemberDTO;
import com.mini.dto.ProductDTO;

public class OliveCustomerMenu {
	
	CustomerDTO cus;
	private Scanner sc = new Scanner(System.in);
	
	BucketView bucketView = new BucketView();
	PurchaseView purchaseView = new PurchaseView();
	CustomerController customerController = new CustomerController();
	
	private int num;
	private int flag; // --> flag = 0 : 종료 --> memeber로 변경 예정
	
	public int OliveMainMenu(CustomerDTO cus) {
		
		this.cus = cus;
		
		do
		{
	        
			System.out.println(" ====== Olive 고객 메인 메뉴 ======");
			// HS
			System.out.println("1. 물품 메뉴 ");
			// EJ
			System.out.println("2. 장바구니 메뉴");
			// JE
			System.out.println("3. 구매목록 메뉴");
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
			// HS
			case 1: purchaseView.purchaseMainView(cus); break;
			// EJ
			case 2: bucketView.BucketMainView(cus); ;break;
			case 3: break;
			case 8: customerController.selectCustomer(); break;
			case 0:
				ClearScreen.ClearConsole();
				System.out.println(" ================ ");
				System.out.println("프로그램을 종료합니다.");
				System.out.println(" ================ ");
				flag = 0;
				break;
			}
			
		}while(num != 0);
		
		return flag;
	}
	
}
