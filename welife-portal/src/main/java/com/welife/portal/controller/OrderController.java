package com.welife.portal.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.welife.pojo.WeUser;
import com.welife.portal.pojo.CartItem;
import com.welife.portal.pojo.Order;
import com.welife.portal.service.CartService;
import com.welife.portal.service.OrderService;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 订单管理Controller
 * 
 * @TODO
 * @author Creeper
 * @Data 2017年8月5日 下午8:09:11
 *
 */
@Controller
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private CartService cartService;
	@Autowired
	private OrderService orderService;

	@RequestMapping("/order-cart")
	public String showOrderCart(HttpServletRequest request, HttpServletResponse response, Model model) {
		// 获取购物车商品列表
		List<CartItem> itemList = cartService.getCartItemList(request, response);
		model.addAttribute("cartList", itemList);
		return "order-cart";
	}

	@RequestMapping("/create")
	public String creatOrder(Order order, HttpServletRequest request, Model model) {
		try {
			// 从request中取user对象
			WeUser user = (WeUser) request.getAttribute("user");
			//在order对象中补全用户信息
			order.setUserId(user.getId());
			order.setBuyerNick(user.getNickname());
			String orderId = orderService.createOrder(order);
			model.addAttribute("orderId", orderId);
			model.addAttribute("payment", order.getPayment());
			model.addAttribute("date", new DateTime().plusDays(3).toString("yyyy-MM-dd"));
			return "success";

		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message", "提交订单时服务器开小差了,请稍后再试");
			return "error/expection";
		}
	}

}
