package com.mini.run;

import java.util.ArrayList;

import com.mini.dto.MemberDTO;
import com.mini.dto.ProductDTO;
import com.mini.dto.customerDTO;
import com.mini.view.OliveMenu;
import com.mini.view.mainView;

public class Application {
	public static void main(String[] args) {
		
		//회원 가입 페이지 생성 후 
		// 주석을 해제할 예정
		//mainView mv = new mainView();
		//mv.mainViews();
		
		OliveMenu om = new OliveMenu();
		
		// test 용 memberDTO olive Menu
		MemberDTO mem = new MemberDTO();
		// test 용
		om.OliveMainMenu(mem);
		
	}
}
