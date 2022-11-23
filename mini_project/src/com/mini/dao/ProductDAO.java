package com.mini.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mini.dto.ProductDTO;

public class ProductDAO {

	public List<ProductDTO> selectAllProduct(SqlSession sqlSession) {
		
		return sqlSession.selectList("selectAllProduct");
	}

	public int insertProduct(SqlSession sqlSession, ProductDTO pro) {
		
		return sqlSession.insert("insertProduct", pro);
	}
   
	public int modifyProduct(SqlSession sqlSession, ProductDTO pro) {
		
		return sqlSession.insert("ProductMapper.modifyProduct", pro);
	}

	public int deleteProduct(SqlSession sqlSession, String code) {

		return sqlSession.delete("deleteProduct", code);
	}
}
