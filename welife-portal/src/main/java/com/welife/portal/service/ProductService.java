package com.welife.portal.service;


import com.welife.portal.pojo.ProductInfo;

/**
 * 商品管理Service
 * 
 * @TODO
 * @author Creeper
 * @Data 2017年7月28日 下午6:38:49
 *
 */
public interface ProductService {

	/**
	 * 根据商品ID获取商品详情基础信息
	 * @author Creeper 2017年7月28日
	 */
	 ProductInfo getProductById(Long productId);

	/**
	 * 根据商品Id查询商品描述
	 * @author Creeper 2017年7月28日
	 */
	 String getProductDesc(Long productId);

	/**
	 * 根据商品Id查询商品规格参数
	 * @author Creeper 2017年7月28日
	 */
	 String getProductParam(Long productId);

}
