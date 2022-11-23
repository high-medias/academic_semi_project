package com.mini.dao;

import com.mini.dto.BucketDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BucketDAO {

    public List<BucketDTO> selectBucket(SqlSession sqlSession, String cus_id) {
        List<BucketDTO> selectBucket = sqlSession.selectList("SelectBucket", cus_id);
        return selectBucket;
    }

    public int deleteProduct(SqlSession sqlSession, String product_no) {
        return sqlSession.delete("DeleteByProductNo", product_no);
    }

    public int deleteAll(SqlSession sqlSession, String cus_id) {
    	return sqlSession.delete("DeleteAllBucket", cus_id);
    }

	public  List<BucketDTO> BucketTotalPrice(SqlSession sqlSession, String cus_id) {
		return sqlSession.selectList("BucketTotalPrice", cus_id);
	}
}
