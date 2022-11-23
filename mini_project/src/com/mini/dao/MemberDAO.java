package com.mini.dao;

import org.apache.ibatis.session.SqlSession;

import com.mini.dto.MemberDTO;

public class MemberDAO {

	public int insertMember(SqlSession sqlSession, MemberDTO memList) {
		
		return sqlSession.insert("insertMember", memList);
	}

}
