package com.mini.controller;

import java.util.Scanner;

import com.mini.dto.MemberDTO;
import com.mini.dto.ProductDTO;

public class PurchaseController {
	
	Scanner sc = new Scanner(System.in);
	
	// 여기서 에러 난다 알아봐야한다.
	// 마스크 구매 및 장바구니 추가
		public MemberDTO maskPurchase(MemberDTO mem, int num) {
			
			switch(num) {
				case 1 : mem.addpList( new ProductDTO(10000,"시트팩","마스크팩",0.0)); break;
				case 2 : mem.addpList( new ProductDTO(5000,"코팩","마스크팩",0.0)); break;
				case 3 : mem.addpList( new ProductDTO(20000,"워시오프팩","마스크팩",0.05)); break;
			}
			
			System.out.println("\n =========================== ");
			System.out.println(" 구매가 완료됐습니다.");
			System.out.println(" =========================== \n");
			
			return mem;
		}
		
		
		public MemberDTO maskShoppingList(MemberDTO mem, int num) {
			
			
			switch(num) {
			case 1 : mem.addbList(new ProductDTO(10000,"시트팩","마스크팩",0.0)); break;
			case 2 : mem.addbList(new ProductDTO(5000,"코팩","마스크팩",0.0)); break;
			case 3 : mem.addbList(new ProductDTO(20000,"워시오프팩","마스크팩",0.05)); break;
			}
			
			System.out.println("\n =========================== ");
			System.out.println(" 장바구니에 추가 완료됐습니다.");
			System.out.println(" =========================== \n");
			
			return mem;
		}
		
		
		//클렌징 구매 및 장바구니 추가
		
		public MemberDTO cleansingPurchase(MemberDTO mem, int num) {
					
			switch(num) {
				case 1 : mem.addpList( new ProductDTO(15000,"폼","클렌징",0.1) ); break;
				case 2 : mem.addpList( new ProductDTO(12000,"젤","클렌징",0.0) ); break;
				case 3 : mem.addpList( new ProductDTO(13000,"오일","클렌징",0.0) ); break;
			}
			
			System.out.println("\n =========================== ");
			System.out.println(" 구매가 완료됐습니다.");
			System.out.println(" =========================== \n");
			
			return mem;
		}
		
		public MemberDTO cleansingShoppingList(MemberDTO mem, int num) {
			
			
			switch(num) {
				case 1 : mem.addbList( new ProductDTO(15000,"폼","클렌징",0.1) ); break;
				case 2 : mem.addbList( new ProductDTO(12000,"젤","클렌징",0.0) ); break;
				case 3 : mem.addbList( new ProductDTO(13000,"오일","클렌징",0.0) ); break;
		}
			
			System.out.println("\n =========================== ");
			System.out.println(" 장바구니에 추가 완료됐습니다.");
			System.out.println(" =========================== \n");
			
			return mem;
		}
		
}
