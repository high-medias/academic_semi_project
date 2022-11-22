package com.mini.dao;

import org.apache.ibatis.session.SqlSession;

import com.mini.dto.CustomerDTO;

public class LoginDAO {

	public CustomerDTO checkLogin(SqlSession sqlSession, String id) {
		
		String id2 = sqlSession.selectOne("CallTheId", id);
		String pwd = sqlSession.selectOne("CallThePwd", id);
		
		return new CustomerDTO(id2, pwd);
	}

}
