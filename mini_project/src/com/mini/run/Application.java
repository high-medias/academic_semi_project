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
		
		//회원 가입 페이지 생성 후 
		// 주석을 해제할 예정
		//mainView mv = new mainView();
		//mv.mainViews();
		
		OliveMemberMenu oliveMemberMenu = new OliveMemberMenu();
		OliveCustomerMenu oliveCustomerMenu = new OliveCustomerMenu();
		
		
		// Mybatis Sample code 입니다
		// Service 객체에서 아래와 같이 사용하시면 됩니다
		// Mapper는 개인적으로 만들어 주시고 config/mybatis-config.xml 아래의 mappes의 추가해주셔야 사용 가능합니다.
		
		// SelectOne 함수는 각 구현하실때 안맞으실 꺼예요
		// 아래의 코드는 단순 DB 연결 접속을 확인하고 나의 mapper가 정상적으로 config에 올라가졌는지 확인하는 함수입니다.
		
		
		
		SqlSession sqlSession = getSqlSession();
		java.util.Date date = sqlSession.selectOne("SampleDate2");
		
		System.out.println(date);
		sqlSession.close();
		
		LoginView loginView = new LoginView();
		loginView.loginMain();
		///
		
		
		/*
		 * 
		 * 본인 이니셜이 작성되어 있는 Member View 혹은 Customer View의
		 * 주석을 푸시면 작성하시면 됩니다.
		 * 
		 */
		
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
