package com.mini.view;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mini.controller.CustomerController;
import com.mini.controller.PurchaseController;
import com.mini.dto.CustomerDTO;
import com.mini.dto.MemberDTO;
import com.mini.dto.ProductDTO;

import oracle.sql.DATE;

public class PurchaseView {
	
	private CustomerDTO cus;
	private int menu;
	private SqlSessionFactory sqlSessionFactory;
	
	
	Scanner sc = new Scanner(System.in);

	PurchaseController purchaseController = new PurchaseController(); //컨트롤러
	
	
	
	public void purchaseMainView(CustomerDTO cus) {
		
		this.cus = cus;

		do 
		{
			
			
			System.out.println(" ====== 물품 구매 및 조회 ====== ");
			System.out.println();
			System.out.println(" 1. 전체 물품 조회");
			System.out.println(" 2. 카테고리로 물품 조회");
			System.out.println(" 3. 판매직원으로 물품 조회");
			System.out.println(" 4. 특정 가격 영역으로 조회");
			System.out.println(" 5. 물품 구매하기");
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
				case 1: purchaseController.selectAllProduct();					break;
				case 2: purchaseController.selectAllCategory(inputCategory());	break;
				case 3: purchaseController.selectAllSeller(inputSeller());		break;
				case 4: purchaseController.selectAllPrice(inputPrice());		break;
				case 5: purchaseController.purchaseProduct(purchase(cus));		break;
				default :
			}
		} while(menu != 0);
//		purchaseController.purchaseProduct(purchase());	
		
	}

	
	public String inputCategory() {
		
		System.out.println("카테고리를 입력해 주세요");
		String category = sc.nextLine();
		return category;
	}
	
	public String inputSeller() {
		
		System.out.println(" 판매직원을 입력해 주세요");
		String seller = sc.nextLine();
		return seller;
	}
	
	public int inputPrice() {
		
		System.out.println(" 조회 할 가격을 입력해 주세요");
		int price = sc.nextInt();
		return price;
	}
	
	
	private Map<String, String> purchase(CustomerDTO cus) {


		
		purchaseController.selectAllProduct();
		
		System.out.println(" 구매 하실 상품의 코드 번호를 입력해 주세요");
		String productNo = sc.nextLine();

		System.out.println(" 원하시는 수량을 입력해 주세요 ");
		String purchaseCount = sc.nextLine();	

		
		Map<String, String> parameter = new HashMap<>();
		
		parameter.put("productNo", productNo);
		parameter.put("count", purchaseCount);
		parameter.put("cusId", cus.getId());
		
		return parameter;
	}
	
	
}
