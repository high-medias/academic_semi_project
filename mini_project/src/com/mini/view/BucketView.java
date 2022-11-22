package com.mini.view;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.mini.controller.BucketController;
import com.mini.dto.BucketDTO;
import com.mini.dto.CustomerDTO;
import com.mini.dto.MemberDTO;


public class BucketView {

    int menu;
    Scanner sc = new Scanner(System.in);
    BucketController bucketController = new BucketController();
    List<BucketDTO> bucketDTOList = new LinkedList<>();

    public void BucketMainView(CustomerDTO cus) {
        ClearScreen.ClearConsole();
		
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
            case 1:
                bucketController.selectBucket(cus.getId());
                break;
            case 2:
            	bucketController.BucketTotalPrice(cus.getId());
                break;
            case 3:
            	bucketController.selectBucket(cus.getId());
                bucketController.deleteProduct(cus.getId(), inputProductName());
                
                bucketController.selectBucket(cus.getId());
                break;
            case 4:
                bucketController.deleteAll(cus.getId());
                break;
            case 0:
                break;
				default: 
					System.out.println("다시 입력해주세요\n");
					break;
	
				}
		}while(menu != 0);

	}

	private String inputProductName() {
		System.out.println(" ======================================= ");
		System.out.print("삭제할 장바구니의 번호를 입력하세요 : ");
        String product_no = sc.nextLine();
		return product_no;
	}

}