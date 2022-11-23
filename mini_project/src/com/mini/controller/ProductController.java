package com.mini.controller;

import java.util.List;
import java.util.Map;

import com.mini.dto.ProductDTO;
import com.mini.service.ProductService;

public class ProductController {

	private final ProductService proService;
	
	
	public ProductController () {
		
		proService = new ProductService();
		
	}
	
	
	
	
	
	public void selectAllProduct() {
		
		List<ProductDTO> proList = proService.selectAllProduct();
	}





	public void registProduct(Map<String, String> parameter) {
		
		String memNo = parameter.get("memNo");
		String no = parameter.get("no");
		String name = parameter.get("name");
		String category = parameter.get("category");
		int price = Integer.parseInt(parameter.get("price"));
		int count = Integer.parseInt(parameter.get("count"));
		
		ProductDTO pro = new ProductDTO();
		pro.setMemNo(memNo);
		pro.setNo(no);
		pro.setName(name);
		pro.setCategory(category);
		pro.setPrice(price);
		pro.setCount(count);
		
		/* printResult 클래스를 만들어서 성공/실패 출력 메세지를 생성할까 고민중 */
		
		
	}





	public void modifyProduct(Map<String, String> parameter) {
		
		String memNo = parameter.get("memNo");
		String no = parameter.get("no");
		String name = parameter.get("name");
		int price = Integer.parseInt(parameter.get("price"));
		String category = parameter.get("category");
		
		ProductDTO pro = new ProductDTO();
		
		pro.setMemNo(memNo);
		pro.setNo(no);
		pro.setName(name);
		pro.setPrice(price);
		pro.setCategory(category);	
		
		
	}

}
