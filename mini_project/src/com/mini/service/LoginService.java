package com.mini.service;
import static com.mini.common.Template.*;

import org.apache.ibatis.session.SqlSession;

import com.mini.dao.LoginDAO;
import com.mini.dto.CustomerDTO;

public class LoginService {
	
	LoginDAO loginDAO = new LoginDAO();

	public boolean checkLogin(String id, String pwd) {
		
		SqlSession sqlSession = getSqlSession();
		CustomerDTO customer = loginDAO.checkLogin(sqlSession, id);
		
		System.out.println(customer);
		
		boolean checkFlag = false;
		
		if(customer != null && customer.getId().equals(id) && customer.getPwd().equals(pwd)) {
			checkFlag = true;
		} else {
			checkFlag = false;
		}
		
		return checkFlag;
	}

	
}
