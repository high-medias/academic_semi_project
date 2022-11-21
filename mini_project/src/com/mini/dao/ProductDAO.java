package com.mini.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mini.dto.ProductDTO;

public class ProductDAO {

	public List<ProductDTO> selectAllProduct(SqlSession sqlSession) {
		
		return sqlSession.selectList("SampleMapper.selectAllMenu");
	}

	public int insertProduct(SqlSession sqlSession, ProductDTO pro) {
		
		return sqlSession.insert("SampleMapper.insertProduct", pro);
	}
   
	public int modifyProduct(SqlSession sqlSession, ProductDTO pro) {
		
		return sqlSession.insert("SampleMapper.modifyProduct", pro);
	}
}
