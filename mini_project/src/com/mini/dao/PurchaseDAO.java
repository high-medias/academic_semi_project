package com.mini.dao;


import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mini.dto.CustomerDTO;
import com.mini.dto.ProductAndMemberDTO;
import com.mini.dto.ProductDTO;



public class PurchaseDAO {

	public List<ProductDTO> selectAllProduct(SqlSession sqlSession) {
		
		return sqlSession.selectList("ProductMapper.selectAllPurchase");
	}

	public List<ProductDTO> selectAllCategory(SqlSession sqlSession, String inputCategory) {
		return sqlSession.selectList("ProductMapper.selectAllCategory" , inputCategory);
	}

	public List<ProductAndMemberDTO> selectAllSeller(SqlSession sqlSession, String inputSeller) {
		return sqlSession.selectList("ProductMapper.selectAllSeller" , inputSeller);
	}

	public List<ProductDTO> selectAllPrice(SqlSession sqlSession, int inputPrice) {
		return sqlSession.selectList("ProductMapper.selectAllPrice" , inputPrice);
	}

	public int purchaseProduct(SqlSession sqlSession, ProductDTO product) {
		return sqlSession.insert("PurchaseMapper.purchaseProduct" , product);
	}



}
