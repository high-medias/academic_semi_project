package com.mini.controller;

import java.util.List;

import com.mini.dto.MemberDTO;
import com.mini.dto.CustomerDTO;
import com.mini.service.CustomerService;

public class CustomerController {

	public void selectCustomer() {
		CustomerService customerService = new CustomerService();
		PrintResult printResult = new PrintResult();
		List<CustomerDTO> cusList = customerService.selectCustomer();
		
		if(cusList != null) {
			printResult.printMenuList(cusList);
		} else {
			printResult.printErrorMessage("selectList");
		}
		
	}

}
