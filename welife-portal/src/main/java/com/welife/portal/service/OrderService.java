package com.welife.portal.service;


import com.welife.portal.pojo.Order;

/**
 * 订单管理Service
 * @author Creeper
 * @data 2017年8月6日 上午10:35:02
 *
 */
public interface OrderService {
	/**
	 * 创建订单
	 */
	String createOrder(Order order);
}
