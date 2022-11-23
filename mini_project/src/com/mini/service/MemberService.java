package com.mini.service;

import org.apache.ibatis.session.SqlSession;

import static com.mini.common.Template.*;
import com.mini.dao.MemberDAO;
import com.mini.dto.MemberDTO;

public class MemberService {

	private MemberDAO memberDAO = new MemberDAO();

	public boolean insertMember(MemberDTO memList) {
	
		SqlSession sqlSession = getSqlSession();

		int result = memberDAO.insertMember(sqlSession, memList);
		
		if(result > 0) {
			
			sqlSession.commit();
		} else {
			
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result > 0? true: false;
	
		
	}

}
