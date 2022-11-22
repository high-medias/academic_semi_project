package com.mini.controller;

import java.util.List;
import java.util.Scanner;

import com.mini.dto.BucketDTO;
import com.mini.dto.MemberDTO;
import com.mini.service.BucketService;

public class BucketController {

	Scanner sc = new Scanner(System.in);
	MemberDTO mem = new MemberDTO();
	BucketService bucketService = new BucketService();
	
	public void deleteProduct(String cus_id, String product_no){
		bucketService.deleteProduct(cus_id, product_no);
	}

	public List<BucketDTO> selectBucket(String cus_id) {
		List<BucketDTO> bucketDTOS = bucketService.selectBucket(cus_id);
		return bucketDTOS;
	}

	public void deleteAll(String cus_id) {
		bucketService.deleteAll(cus_id);
	}
}
