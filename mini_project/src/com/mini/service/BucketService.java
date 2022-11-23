package com.mini.service;

import com.mini.dao.BucketDAO;
import com.mini.dto.BucketDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.mini.common.Template.getSqlSession;

public class BucketService {

    BucketDAO bucketDAO = new BucketDAO();

    public List<BucketDTO> selectBucket(String cus_id) {
        SqlSession sqlSession = getSqlSession();
        List<BucketDTO> bucketDTOS = bucketDAO.selectBucket(sqlSession, cus_id);
        return bucketDTOS;
    }

    public void deleteProduct(String product_no) {
        SqlSession sqlSession = getSqlSession();
        int result = bucketDAO.deleteProduct(sqlSession, product_no);
        
        if(result > 0) {
        	sqlSession.commit();
        } else {
        	sqlSession.rollback();
        }
    }

    public void deleteAll(String cus_id) {
        SqlSession sqlSession = getSqlSession();
        int result = bucketDAO.deleteAll(sqlSession, cus_id);
        
        if(result > 0) {
        	sqlSession.commit();
        } else {
        	sqlSession.rollback();
        }
    }

	public int BucketTotalPrice(String cus_id) {
		SqlSession sqlSession = getSqlSession();
		
		int sum = 0;
		
		List<BucketDTO> bucketDTO = bucketDAO.BucketTotalPrice(sqlSession, cus_id);
		
		for(BucketDTO bucket : bucketDTO){
			sum += bucket.getPrice().multiply(bucket.getBucket_count()).intValue();
		}
		
		return sum;
	}
}
