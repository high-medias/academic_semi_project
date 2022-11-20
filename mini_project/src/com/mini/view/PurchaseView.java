package com.mini.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mini.controller.PurchaseController;
import com.mini.dto.CustomerDTO;
import com.mini.dto.MemberDTO;
import com.mini.dto.ProductDTO;

public class PurchaseView {
	
	private CustomerDTO cus;
	private int menu;
	
	Scanner sc = new Scanner(System.in);

	
	public void purchaseMainView(CustomerDTO cus) {
		
		this.cus = cus;

		do 
		{
			ClearScreen.ClearConsole();
			
			System.out.println(" ====== 올리브영 화장품 카테고리 ====== ");
			System.out.println();
			System.out.println(" 1. 전체 물품 조회");
			System.out.println(" 2. 카테고리로 물품 조회");
			System.out.println(" 3. 판매직원으로 물품 조회");
			System.out.println(" 4. 특정 가격 영역으로 조회");
			System.out.println();
			System.out.println(" ---------------------------------");
			System.out.println(" 0. 이전 메뉴로 돌아가기");
			System.out.println(" ================================== \n");
			System.out.println();
			System.out.print(" 번호를 입력하세요 :   "); //누를 시 제품별 메소드로 이동
			
			menu = sc.nextInt();
			sc.nextLine();
			
			System.out.println();
			
			switch(menu) {
				case 1: break;
				case 2: break;
				default :
			}
		} while(menu != 0);

		ClearScreen.ClearConsole();
	}

	
}
