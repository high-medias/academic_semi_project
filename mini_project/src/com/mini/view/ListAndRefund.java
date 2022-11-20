package com.mini.view;
import java.util.Scanner;

import com.mini.controller.BucketController;
import com.mini.dto.CustomerDTO;
import com.mini.dto.MemberDTO;


public class ListAndRefund {
	
	int menu;
	Scanner sc = new Scanner(System.in);
	
	public void ListAndRefundMainView(CustomerDTO cus) {
		ClearScreen.ClearConsole();
		
		//현재 임시 객체의 customer의 PK는 CUS_ID이고 값은 "user01"입니다.
		
		// JE님 난이도가 조금 있을 수 있습니다.
		// 잘 안되시면 말씀 주셔요!
		// 각 기능 마다 설명을 최대한 자세히 달아 보겠습니다.
		
		do {
			System.out.println(" ========= 나의 구매목록 / 환불 관련 메뉴 ======== ");
			System.out.println("1. 나의 구매 내역 조회");
			System.out.println("2. 주문번호를 통한 배송일자 조회");
			System.out.println("3. 특정 구매일로 조회 하기");
			
			/*
			 * 환불하기 ==>
			 *   1. DB에 purchase table 환불여부 확인하기 ("Y" or "N");
			 *   2. DB Y이면 환불이 완료된 것, N 인경우 환불 프로세스 진행
			 *   3. 구매자의 아이디와 상품코드를 통해 purchase 테이블의 구매량을 파악 하여
			 *       환불금액을 refund 테이블에 입력, && 환불 일자도 같이 입력한다.
			 *   4. purchase 테이블의 환불여부를 "N" -> "Y"로 변
			 *   5. 환불이 완료 되었으므로 상품코드를 통하여 DB의 상품 테이블에 수량을 증가 시킨다.
			 */
			System.out.println("4. 환불하기");
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