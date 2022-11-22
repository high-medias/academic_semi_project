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

    public void deleteProduct(SqlSession sqlSession, String cus_id, String product_no) {
        Map<String, String> map = new HashMap<>();
        map.put("cus_id", cus_id);
        map.put("product_no", String.valueOf(product_no));
        sqlSession.delete("DeleteByProductNo",map);
    }

    public void deleteAll(SqlSession sqlSession, String cus_id) {
        sqlSession.delete("DeleteAllBucket", cus_id);
    }
}
