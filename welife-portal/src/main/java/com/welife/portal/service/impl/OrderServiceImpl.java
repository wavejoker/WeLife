package com.welife.portal.service.impl;

import com.welife.common.utils.HttpClientUtil;
import com.welife.common.utils.JsonUtils;
import com.welife.common.utils.WeLifeResult;
import com.welife.portal.pojo.Order;
import com.welife.portal.service.OrderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class OrderServiceImpl implements OrderService {

	@Value("${ORDER_BASE_URL}")
	private String ORDER_BASE_URL;
	@Value("${ORDER_CREAT_URL}")
	private String ORDER_CREAT_URL;

	@Override
	public String createOrder(Order order) {
		try {
		// 调用taotao-order的服务,提交订单
		String json = HttpClientUtil.doPostJson(ORDER_BASE_URL + ORDER_CREAT_URL, JsonUtils.objectToJson(order));
		// 把json转换成TaotaoResult
			WeLifeResult result = WeLifeResult.format(json);
		if (result.getStatus() == 200) {
			Object orderId = result.getData();
			return orderId.toString();
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

}
