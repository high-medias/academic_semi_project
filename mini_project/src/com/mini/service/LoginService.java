package com.mini.service;
import static com.mini.common.Template.*;

import org.apache.ibatis.session.SqlSession;

import com.mini.dao.LoginDAO;
import com.mini.dto.CustomerDTO;
import com.mini.dto.MemberDTO;

public class LoginService {
	
	LoginDAO loginDAO = new LoginDAO();

	public CustomerDTO CustomerCheckLogin(String id, String pwd) {
		
		SqlSession sqlSession = getSqlSession();
		
		CustomerDTO customer = loginDAO.CustomerCheckLogin(sqlSession, id);
		System.out.println(customer);

		return customer;
	}
	
	public MemberDTO MemberCheckLogin(String id, String pwd) {
		
		SqlSession sqlSession = getSqlSession();

		MemberDTO member = loginDAO.MemberCheckLogin(sqlSession, id);
		System.out.println(member);

		return member;
	}

	
}
