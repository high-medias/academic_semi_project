package com.mini.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.mini.controller.LoginController;
import com.mini.controller.ProductController;
import com.mini.dto.MemberDTO;
import com.mini.dto.ProductDTO;

public class ProductView {
	
	MemberDTO mem;
	ProductDTO productDTO;
	ProductController productController = new ProductController();
	LoginController lC = new LoginController();
	Scanner sc = new Scanner(System.in);
	
	SignUpView suV = new SignUpView();

	
	public MemberDTO ProductMangagement() {
		int num;
		
		/* 4. 재고 관리는 물품 수량만 변경할 수 있게 설정 해 두었고
		 * 추가 수정 재고 관리 삭제 모두 관리 직원번호가 바뀌어 누가 
		 * 추가 수정 재고 관리 삭제 했는지 알 수 있게 했다.*/
		do{
			System.out.println(" ====== 상품 관리 ======");
			System.out.println("1. 상품 전체 조회");
			System.out.println("2. 상품 추가");
			System.out.println("3. 상품 수정");
			System.out.println("4. 상품 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.println(" ============================ \n");
			
			System.out.print("메뉴를 입력하세요 : ");
			num = sc.nextInt();
			sc.nextLine();
			System.out.println();

			switch(num) {
			case 1: productController.selectAllProduct(); break;
			case 2: productController.registProduct(inputProduct()); break;
			case 3: productController.modifyProduct(inputModifyProduct()); break;
			case 4: productController.deleteProduct(inputMenuCode()); break;
			case 0:	
				ClearScreen.ClearConsole();
				System.out.println(" ================ ");
				System.out.println("프로그램을 종료합니다.");
				System.out.println(" ================ ");
				System.out.println();
				mem = null;
				break;
			}
		}while(num != 0 && num != 2);
		
		return mem;
	}


	private Map<String, String> inputMenuCode() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제하실 상품 코드를 입력하세요 : ");
		String code = sc.nextLine();
		
		Map<String, String> parameter = new HashMap<>();
		parameter.put("code", code);
		return parameter;
	}


	private static Map<String, String> inputModifyProduct() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 직원번호를 입력하세요 : ");
		String memNo = sc.nextLine();
		System.out.print("수정할 상품 번호를 입력하세요 : ");
		String no = sc.nextLine();
		System.out.print("수정할 상품 이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("수정할 상품 가격을 입력하세요 : ");
		String price = sc.nextLine();
		System.out.print("수정할 카테고리 코드를 입력하세요 : ");
		String category = sc.nextLine();
		
		Map<String, String> parameter = new HashMap<>();
		
		parameter.put("memNo", memNo);
		parameter.put("no", no);
		parameter.put("name", name);
		parameter.put("price", price);
		parameter.put("category", category);
		
		return parameter;
	}


	private static Map<String, String> inputProduct() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 직원번호를 입력하세요 : ");
		String memNo = sc.nextLine();
		System.out.print("상품 번호를 입력하세요 : ");
		String no = sc.nextLine();
		System.out.print("상품명을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("상품 카테고리를 입력하세요 : ");
		String category = sc.nextLine();
		System.out.print("상품 가격을 입력하세요 : ");
		String price = sc.nextLine();
		System.out.print("상품 수량을 입력하세요 : ");
		String count = sc.nextLine();
		
		Map<String, String> parameter = new HashMap<>();
		parameter.put("memNo", memNo);
		parameter.put("no", no);
		parameter.put("name", name);
		parameter.put("category", category);
		parameter.put("price", price);
		parameter.put("count", count);
		
		
		return parameter;
	}
}
