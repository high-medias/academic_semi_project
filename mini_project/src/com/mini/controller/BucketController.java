package com.mini.controller;

import java.util.Scanner;

import com.mini.dto.MemberDTO;
import com.mini.dto.ProductDTO;

public class BucketController {

	Scanner sc = new Scanner(System.in);
	MemberDTO mem = new MemberDTO();
	
	public void deleteProduct(MemberDTO mem, int bSize) {
		int deletenum;
		deletenum = sc.nextInt();
		sc.nextLine();
		
		while(deletenum >= bSize) {
			System.out.println("\n");
			System.out.println(" ============================ ");
			System.out.println(" = 입력한 숫자가 잘 못 되었습니다. = ");
			System.out.println(" =      다시 입력해 주세요.     = ");
			System.out.println(" ============================ ");
			System.out.println();
			
			System.out.println("  ========================= ");
			System.out.print(" 삭제하실 상품의 번호를 입력해주세요 : ");
			
			deletenum = sc.nextInt();
			sc.nextLine();
		}
		
		System.out.println();
		System.out.println();
	}
}
