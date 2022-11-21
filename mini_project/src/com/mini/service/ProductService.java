package com.mini.service;

import static com.mini.common.Template.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mini.dao.ProductDAO;
import com.mini.dto.ProductDTO;

public class ProductService {
	
	private final ProductDAO proDAO;
	
	public ProductService() {
		
		proDAO = new ProductDAO();
	}
	
	

	public List<ProductDTO> selectAllProduct() {
		
		SqlSession sqlSession = getSqlSession();
		
		List<ProductDTO> proList = proDAO.selectAllProduct(sqlSession);
		
		sqlSession.close();
		
		return proList;
	}

	public boolean registProduct(ProductDTO pro) {
		
		SqlSession sqlSession = getSqlSession();
		
		int result = proDAO.insertProduct(sqlSession, pro);
		
		if(result > 0) {
			
			sqlSession.commit();
		} else {
			
			sqlSession.rollback();
		}
		sqlSession.close();
		
		return result > 0? true: false;
				
	}
	
	public boolean modifyProduct(ProductDTO pro) {
		
		SqlSession sqlSession = getSqlSession();
		
		int result = proDAO.insertProduct(sqlSession, pro);
		
		if(result > 0) {
			
			sqlSession.commit();
		} else {
			
			sqlSession.rollback();
		}
		sqlSession.close();
		
		return result > 0? true: false;
				
	}
	
	
	
}
