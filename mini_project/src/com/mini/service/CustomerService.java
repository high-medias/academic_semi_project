package com.mini.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import static com.mini.common.Template.*;

import com.mini.dao.CustomerDAO;
import com.mini.dto.CustomerDTO;
import com.mini.dto.MemberDTO;

public class CustomerService {
	
	private CustomerDAO customerDAO = new CustomerDAO();

	public List<CustomerDTO> selectCustomer() {
		
		SqlSession sqlSession = getSqlSession();
		List<CustomerDTO> cusList = customerDAO.selectCustomer(sqlSession);
		sqlSession.close();
		return cusList;
	}

}
