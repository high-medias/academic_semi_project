package com.mini.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mini.dto.CustomerDTO;

public class CustomerDAO {

	public List<CustomerDTO> selectCustomer(SqlSession sqlSession) {
		
		return sqlSession.selectList("customerMapper.selectAllMenu");
	}

}
