package com.mini.controller;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import com.mini.dto.CustomerDTO;
import com.mini.dto.MemberDTO;
import com.mini.service.LoginService;
import com.mini.view.ClearScreen;
import com.mini.view.OliveCustomerMenu;
import com.mini.view.OliveMemberMenu;

public class LoginController {

	LoginService loginService = new LoginService();
	
	public void checkLogin(CustomerDTO customerDTO) {
		
		String id = customerDTO.getId();
		String pwd = customerDTO.getPwd();
		
		CustomerDTO cus = loginService.CustomerCheckLogin(id, pwd);
		
		if(cus != null && cus.getId().equals(id) && cus.getPwd().equals(pwd)) {
			System.out.println("@@@ 로그인 성공 @@@");
			OliveCustomerMenu oliveCustomerMenu = new OliveCustomerMenu();
			oliveCustomerMenu.OliveMainMenu(cus);
			
		} else {
			ClearScreen.ClearConsole();
			System.out.println(" ================= ");
			System.out.println(" ====로그인 실패====");
			System.out.println(" 프로그램을 종료합니다. ");
			System.out.println(" ================= ");
			System.out.println();
		}

	}
	
	public void checkLogin(MemberDTO memberDTO) {
		
		String id = memberDTO.getNo();
		String pwd = memberDTO.getPwd();
		
		MemberDTO mem = loginService.MemberCheckLogin(id, pwd);
		
		if(mem != null && mem.getNo().equals(id) && mem.getPwd().equals(pwd)) {
			System.out.println("@@@ 로그인 성공 @@@");
			OliveMemberMenu oliveMemberMenu = new OliveMemberMenu();
			oliveMemberMenu.OliveMainMenu(mem);
		} else {
			ClearScreen.ClearConsole();
			System.out.println(" ================= ");
			System.out.println(" ====로그인 실패====");
			System.out.println(" 프로그램을 종료합니다. ");
			System.out.println(" ================= ");
			System.out.println();
		}
	}
	
}
