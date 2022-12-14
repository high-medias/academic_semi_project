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
	ListAndRefund listAndRefund = new ListAndRefund();
	CustomerController customerController = new CustomerController();
	
	private int num;
	private int flag; // --> flag = 0 : 종료 --> memeber로 변경 예정
	
	public int OliveMainMenu(CustomerDTO cus) {
		
		this.cus = cus;
		
		do
		{
	        
			System.out.println(" ====== Olive 고객 메인 메뉴 ======");
			// HS
			System.out.println("1. 물품 구매 및 조회");
			// EJ
			System.out.println("2. 장바구니 메뉴");
			// JE
			System.out.println("3. 나의 구매목록 / 환불 관련 메뉴");
			System.out.println("0. 로그아웃");
			System.out.println(" =========================== \n");
			
			System.out.print("메뉴를 입력하세요 : ");
			
			System.out.println();
			num = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
				switch(num) {
				// HS
				case 1: purchaseView.purchaseMainView(cus); break;
				// EJ
				case 2: bucketView.BucketMainView(cus); ;break;
				// JE
				case 3: listAndRefund.ListAndRefundMainView(cus); break;
				case 0:
					flag = 0;
					break;
			}
			
		}while(num != 0);
		
		return 0;
	}
	
}
