package com.greedy.purchase.mapper.xml;


import java.util.List;
import java.util.Map;

import com.mini.dto.ProductDTO;

public interface DynamicPurchaseMapper {

	List<ProductDTO> selectAllPrice(Map<String, Integer> map);

}
