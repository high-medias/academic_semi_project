package com.mini.run;

import java.util.ArrayList;
import java.util.Date;

import com.mini.dto.MemberDTO;
import com.mini.dto.ProductDTO;
import com.mini.dto.CustomerDTO;
import com.mini.view.OliveCustomerMenu;
import com.mini.view.OliveMemberMenu;
import com.mini.view.mainView;

public class Application {
	public static void main(String[] args) {
		
		//회원 가입 페이지 생성 후 
		// 주석을 해제할 예정
		//mainView mv = new mainView();
		//mv.mainViews();
		
		OliveMemberMenu oliveMemberMenu = new OliveMemberMenu();
		OliveCustomerMenu oliveCustomerMenu = new OliveCustomerMenu();
		
		
		/*
		 * 
		 * 본인 이니셜이 작성되어 있는 Member View 혹은 Customer View의
		 * 주석을 푸시면 작성하시면 됩니다.
		 * 
		 */
		
		// test 용 memberDTO olive Menu //직원
		
		/* @@@@@ JS, KNY, MJ @@@@@ */
		MemberDTO mem = new MemberDTO("1", "김을옹", 26, "F", "대리", new Date(), null);
		oliveMemberMenu.OliveMainMenu(mem);
		
		
		// test 용 CustomerDTO olive Menu //고객
		
		/* @@@@@ HS, EJ, JE  @@@@@ */
		CustomerDTO cus = new CustomerDTO("user01", "pass01", "이영우", "F", "010-8846-4893", "1");
		// oliveCustomerMenu.OliveMainMenu(cus);
		
	}
}
