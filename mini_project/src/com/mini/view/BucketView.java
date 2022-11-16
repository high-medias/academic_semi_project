package com.mini.view;
import java.util.Scanner;

import com.mini.controller.BucketController;
import com.mini.dto.MemberDTO;

 

public class BucketView {
	
	int menu;
	Scanner sc = new Scanner(System.in);
	BucketController bC = new BucketController();

	public void BucketMainView(MemberDTO mem) {
		int bucketSize;
		ClearScreen.ClearConsole();
		
		do {
			
			bucketSize =  bC.getsListcount(mem);
			
			if(bucketSize == 0) {
				ClearScreen.ClearConsole();
				
				System.out.println(" ========================");
				System.out.println("    장바구니가 비어 있습니다.    ");
				System.out.println("  ** 이전 메뉴로 돌아갑니다 **   ");
				System.out.println(" ========================");
				System.out.println();
				return;
			}
			
			System.out.println(" ========= 장바구니 메뉴 ======== ");
			System.out.println("1. 장바구니 가격조회");
			System.out.println("2. 장바구니 상품 삭제");
			System.out.println("3. 장바구니 비우기");
			System.out.println("0. 메인 메뉴");
			System.out.println(" ============================= ");
			System.out.println();
			System.out.print("메뉴를 입력하세요 : ");
			menu = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch(menu) {

				case 1: 
					ClearScreen.ClearConsole();
					for(int i=0; i < bucketSize; i++ ) {
						System.out.print((i) + " : ");
						System.out.println( bC.getsList(mem).get(i) ) ;
					}
					System.out.println();
					break;
					
					
					// 만약에 장바구니가 비어졌으면 이 기능을 못하게 막아야 
				case 2: 
					ClearScreen.ClearConsole();
					for(int i=0; i < bucketSize; i++ ) {
						System.out.print((i) + " : ");
						System.out.println( bC.getsList(mem).get(i) );
					}
					System.out.println(" ========================");
					System.out.print("삭제하실 상품의 번호를 입력해주세요 : ");
					bC.deleteProduct(mem, bucketSize);
					break;
	
					
				case 3: 
					ClearScreen.ClearConsole();
					System.out.println("장바구니가 비워졌습니다.");
					bC.removeProductAll(mem);
					break;
	
				case 0: 
					ClearScreen.ClearConsole();
					System.out.println("프로그램을 종료합니다.");
					System.out.println();
					break;
	
				default: 
					System.out.println("다시 입력해주세요\n");
					break;
	
				}
		}while(menu != 0);

	}

}