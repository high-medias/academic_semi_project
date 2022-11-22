package com.mini.run;

import java.util.ArrayList;
import static com.mini.common.Template.*;
import java.util.Date;

import org.apache.ibatis.session.SqlSession;

import com.mini.dto.MemberDTO;
import com.mini.dto.ProductDTO;
import com.mini.dto.CustomerDTO;
import com.mini.view.LoginView;
import com.mini.view.OliveCustomerMenu;
import com.mini.view.OliveMemberMenu;
import com.mini.view.mainView;

public class Application {
	public static void main(String[] args) {
		
		mainView mv = new mainView();
		mv.mainViews();
		
		// test 용 memberDTO olive Menu //직원
		
		/* @@@@@ JS, KNY, MJ @@@@@ */
		// MemberDTO mem = new MemberDTO("1", "김을옹", 26, "F", "대리", new Date(), null);
		// oliveMemberMenu.OliveMainMenu(mem);
		
		
		// test 용 CustomerDTO olive Menu //고객
		
		/* @@@@@ HS, EJ, JE  @@@@@ */
		// CustomerDTO cus = new CustomerDTO("user01", "pass01", "이영우", "F", "010-8846-4893", "1");
		// oliveCustomerMenu.OliveMainMenu(cus);
		
		
	}
}
