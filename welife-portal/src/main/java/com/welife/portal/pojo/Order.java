package com.welife.portal.pojo;

import java.util.List;

import com.welife.pojo.WeOrder;
import com.welife.pojo.WeOrderItem;
import com.welife.pojo.WeOrderShipping;

/**
 * 接收页面参数的POJO
 *
 * @author Creeper
 * @Data 2017年8月5日 下午6:46:21
 *
 */


public class Order extends WeOrder {

	private List<WeOrderItem> orderItems;
	private WeOrderShipping orderShipping;

	public List<WeOrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<WeOrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public WeOrderShipping getOrderShipping() {
		return orderShipping;
	}

	public void setOrderShipping(WeOrderShipping orderShipping) {
		this.orderShipping = orderShipping;
	}

}
