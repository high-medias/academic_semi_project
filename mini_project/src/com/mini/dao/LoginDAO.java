package com.mini.dao;

import org.apache.ibatis.session.SqlSession;

import com.mini.dto.CustomerDTO;
import com.mini.dto.MemberDTO;

public class LoginDAO {

	public CustomerDTO CustomerCheckLogin(SqlSession sqlSession, String id) {
		return sqlSession.selectOne("CustomerIdPwd", id);
	}
	
	public MemberDTO MemberCheckLogin(SqlSession sqlSession, String id) {
		return sqlSession.selectOne("MemberIdPwd", id);
	}

}
