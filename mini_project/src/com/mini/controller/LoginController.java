package com.mini.controller;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import com.mini.dto.CustomerDTO;
import com.mini.service.LoginService;

public class LoginController {

	LoginService loginService = new LoginService();
	
	public void checkLogin(CustomerDTO customer) {
		
		String id = customer.getId();
		String pwd = customer.getPwd();
		
		if(loginService.checkLogin(id, pwd)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}

	}
	
}
