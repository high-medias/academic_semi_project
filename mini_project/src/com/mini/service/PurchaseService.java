package com.mini.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.greedy.purchase.mapper.xml.DynamicPurchaseMapper;
import com.mini.dao.PurchaseDAO;
import com.mini.dto.CustomerDTO;
import com.mini.dto.ProductAndMemberDTO;
import com.mini.dto.ProductDTO;

import static com.mini.common.Template.getSqlSession;

public class PurchaseService {

	private PurchaseDAO purchaseDAO;
	private DynamicPurchaseMapper dynamicPurchaseMapper;
	
	public PurchaseService() {
		purchaseDAO = new PurchaseDAO();
	}
	
	
	public List<ProductDTO> selectAllProduct() {
		
		SqlSession sqlSession = getSqlSession();
		
		List<ProductDTO> pList = purchaseDAO.selectAllProduct(sqlSession);
		
		sqlSession.close();
		
		return pList;
	}


	public List<ProductDTO> selectAllCategory(String inputCategory) {
		
		SqlSession sqlSession = getSqlSession();
		
		List<ProductDTO> pList = purchaseDAO.selectAllCategory(sqlSession, inputCategory);
		
		sqlSession.close();
		
		return pList;
	}


	public List<ProductAndMemberDTO> selectAllSeller(String inputSeller) {
		SqlSession sqlSession = getSqlSession();
		
		List<ProductAndMemberDTO> pList = purchaseDAO.selectAllSeller(sqlSession, inputSeller);
		
		sqlSession.close();
		
		return pList;
	}


	
	
	//동적쿼리 이용
	public List<ProductDTO> selectAllPrice(int inputPrice) {
		
		SqlSession sqlSession = getSqlSession();
		
		dynamicPurchaseMapper = sqlSession.getMapper(DynamicPurchaseMapper.class);
		
		Map<String, Integer> map = new HashMap<>();
		map.put("price", inputPrice);
		
		List<ProductDTO> pList = dynamicPurchaseMapper.selectAllPrice(map);
		
		sqlSession.close();
		
		return pList;
	}


	
	//구매하기
	public boolean purchaseProduct(ProductDTO product) {
		SqlSession sqlSession = getSqlSession();
		
		int result = purchaseDAO.purchaseProduct(sqlSession, product);
		
		if(result > 0) {
			
			sqlSession.commit();
		} else {
			
			sqlSession.rollback();
		}
		
		result = purchaseDAO.modifyCount(sqlSession, product);
		
		
		if(result > 0) {
			
			sqlSession.commit();
		} else {
			
			sqlSession.rollback();
		}
		
	
		sqlSession.close();
		
		return result > 0? true: false;
	}

}
