package com.mini.controller;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.mini.dto.BucketDTO;
import com.mini.dto.MemberDTO;
import com.mini.service.BucketService;

public class BucketController {

	Scanner sc = new Scanner(System.in);
	MemberDTO mem = new MemberDTO();
	BucketService bucketService = new BucketService();

	public void selectBucket(String cus_id) {
		List<BucketDTO> bucketDTOS = bucketService.selectBucket(cus_id);
		bucketDTOS.forEach(System.out::println);
	}
	
	public void BucketTotalPrice(String cus_id) {
		int result = bucketService.BucketTotalPrice(cus_id);
		System.out.println("================================");
		System.out.print(" 장바구니에 담긴 물품의 총 금액 : ");
		System.out.println( result + " 원");
		System.out.println("================================");
	}
	
	public void deleteProduct(String cus_id, String product_no){
		bucketService.deleteProduct(product_no);
	}

	public void deleteAll(String cus_id) {
		bucketService.deleteAll(cus_id);
	}
}
