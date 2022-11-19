package com.mini.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mini.controller.PurchaseController;
import com.mini.dto.MemberDTO;
import com.mini.dto.ProductDTO;

public class PurchaseView {
	
	private MemberDTO mem;
	private int menu;
	
	Scanner sc = new Scanner(System.in);

	
	public MemberDTO purchaseMainView(MemberDTO mem) {
		
		this.mem = mem;

		do 
		{
			ClearScreen.ClearConsole();
			
			System.out.println(" ====== 올리브영 화장품 카테고리 ====== ");
			System.out.println();
			System.out.println(" 1. 마스크팩");
			System.out.println(" 2. 클렌징");
			System.out.println();
			System.out.println(" ---------------------------------");
			System.out.println(" 0. 이전 메뉴로 돌아가기");
			System.out.println(" ================================== \n");
			System.out.println();
			System.out.print(" 화장품 카테고리를 입력하세요 :   "); //누를 시 제품별 메소드로 이동
			
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
		return mem;
	}

// 카테고리별 리스트	
	
	public MemberDTO maskPackView(MemberDTO mem) {
		
		int num;
	
		PurchaseController pC = new PurchaseController();
		
		do {
			
			do {
				System.out.println();
				System.out.println(" ============== 마스크팩 물품 정보 ============= ");
				System.out.printf( " 1. %s : %s \t %s : %,5d원\n","상품명","시트팩","가격",10000);
				System.out.printf( " 2. %s : %s \t\t %s : %,5d원\n","상품명","코팩","가격",5000);
				System.out.printf( " 3. %s : %s \t %s : %,5d원 \t\t 이벤트할인 : 5%% \n","상품명","워시오프팩","가격",20000);
				System.out.printf( " 0. 카테고리 메뉴 \n");
				System.out.println(" =========================================== ");
				System.out.println();
				
				System.out.print("물품을 선택하세요 : ");
				num = sc.nextInt();
				sc.nextLine();
				System.out.println();
				
				if(num >= 0 && num < 4) {
					break;
				}
				else {
					System.out.println(" ================================= ");
					System.out.println(" @@@@@@@ 잘 못 입력하셨습니다. @@@@@@");
					System.out.println(" ================================= ");
				}
				
			}while(true);
			
			// 메인 메뉴로 탈출
			if(num == 0) {
				ClearScreen.ClearConsole();
				return mem;
			}
			
			System.out.println();
			System.out.println(" ============== 선택 물품 구매 / 장바구니 추가  ============= \n");
			System.out.println(" 선택한 물품 구매 / 장바구니 선택 : (1. 구매하기 / 2. 장바구니 추가 / 3.취소-물품 다시보기 / 0. 카테고리 메뉴)  ");
			System.out.println("\n ===================================================== ");
			System.out.println();
			
			System.out.print("메뉴를 선택하세요 : ");
			menu = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch(menu) {
				case 1: break;
				case 2: break;
				case 3: break;
			}
		} while(menu != 0 );
		
		ClearScreen.ClearConsole();
		
		return mem;	
	}
	
	
	
	public MemberDTO cleansingFoamView(MemberDTO mem) {
		
		int num;
		PurchaseController pC = new PurchaseController();
		
		do {
			
			do {
				System.out.println();
				System.out.println(" ============== 클랜징 물품 정보 ============= ");
				System.out.printf( " 1. %s : %s \t %s : %,5d원\t\t 이벤트할인 : 10%% \n","상품명","클렌징 폼","가격",15000);
				System.out.printf( " 2. %s : %s \t %s : %,5d원\n","상품명","클렌징 젤","가격",12000);
				System.out.printf( " 3. %s : %s \t %s : %,5d원 \n","상품명","클렌징 오일","가격",13000);
				System.out.printf( " 0. 카테고리 메뉴 \n");
				System.out.println(" =========================================== ");
				System.out.println();
				
				System.out.print("물품을 선택하세요 : ");
				num = sc.nextInt();
				sc.nextLine();
				System.out.println();
				
				if(num >= 0 && num < 4) {
					break;
				}
				else {
					System.out.println(" ================================= ");
					System.out.println(" @@@@@@@ 잘 못 입력하셨습니다. @@@@@@");
					System.out.println(" ================================= ");
				}
				
			}while(true);
			
			// 메인 메뉴로 탈
			if(num == 0) {
				ClearScreen.ClearConsole();
				return mem;
			}
						
			System.out.println();
			System.out.println(" ============== 선택 물품 구매 / 장바구니 추가  ============= \n");
			System.out.println(" 선택한 물품 구매 / 장바구니 선택 : (1. 구매하기 / 2. 장바구니 추가 / 3.취소-물품 다시보기 / 0. 카테고리 메뉴)  ");
			System.out.println("\n ===================================================== ");
			System.out.println();
			
			System.out.print("메뉴를 선택하세요 : ");
			menu = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			// @#$@#$ 여기 시작하
			switch(menu) {
			case 1: break;
			case 2: break;
			case 3: break;
			}
			
		} while(menu != 0);	
	
		
		return mem;			
	}
	
	public void printAllLists(MemberDTO mem) {
		/*
		System.out.println("구매하신 목록입니다.");
		
		int size = mem.getpList().size();
		
		for(int i = 0; i < size; i++) {
			
			System.out.println(mem.getpList().get(i));
			
		}*/
		
	}
	
}
