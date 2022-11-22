package com.mini.dao;

import org.apache.ibatis.session.SqlSession;

import com.mini.dto.CustomerDTO;

public class LoginDAO {

	public CustomerDTO checkLogin(SqlSession sqlSession, String id) {

		return sqlSession.selectOne("CallTheIdPwd", id);
	}

}
