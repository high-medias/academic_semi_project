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

    public void deleteProduct(String cus_id, String product_no) {
        SqlSession sqlSession = getSqlSession();
        bucketDAO.deleteProduct(sqlSession, cus_id, product_no);
    }

    public void deleteAll(String cus_id) {
        SqlSession sqlSession = getSqlSession();
        bucketDAO.deleteAll(sqlSession, cus_id);
    }
}
