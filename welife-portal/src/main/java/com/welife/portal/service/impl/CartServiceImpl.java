package com.welife.portal.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.welife.common.utils.CookieUtils;
import com.welife.common.utils.HttpClientUtil;
import com.welife.common.utils.JsonUtils;
import com.welife.common.utils.WeLifeResult;
import com.welife.pojo.WeProduct;
import com.welife.portal.pojo.CartItem;
import com.welife.portal.service.CartService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class CartServiceImpl implements CartService {

	@Value("${REST_BASE_URL}")
	private String REST_BASE_URL;
	@Value("${PRODUCT_INFO_URL}")
	private String PRODUCT_INFO_URL;

	@Override
	public WeLifeResult addCartItem(Long itemId, Integer num, HttpServletRequest request,
			HttpServletResponse response) {
		// 取商品信息
		CartItem cartItem = null;
		// 取购物车商品列表
		List<CartItem> itemList = getCartItemList(request);
		// 判断购物车中存在此商品
		for (CartItem cItem : itemList) {
			// 如果存在此商品,则增加商品数量
			if (cItem.getId().equals(itemId)) {
				cItem.setNum(cItem.getNum() + num);
				cartItem = cItem;
				break;
			}
		}
		if (cartItem == null) {
			cartItem = new CartItem();
			// 根据商品的ID查询商品的基本信息
			String json = HttpClientUtil.doGet(REST_BASE_URL + PRODUCT_INFO_URL + itemId);
			// 把json转换成java对象
			WeLifeResult weLifeResult = WeLifeResult.formatToPojo(json, WeProduct.class);
			assert weLifeResult != null;
			if (weLifeResult.getStatus() == 200) {
				WeProduct product = (WeProduct) weLifeResult.getData();
				cartItem.setId(product.getId());
				cartItem.setImage(product.getImg() == null ? "" : product.getImg().split(",")[0]);
				cartItem.setNum(num);
				cartItem.setTitle(product.getTitle());
				cartItem.setPrice(product.getPrice());
			}
			// 将此商品添加到购物车列表
			itemList.add(cartItem);
		}
		CookieUtils.setCookie(request, response, "TT_CART", JsonUtils.objectToJson(itemList));
		return WeLifeResult.ok();
	}

	@Override
	public WeLifeResult deleteCartItem(Long itemId, HttpServletRequest request, HttpServletResponse response) {
		// 从cookie中取商品列表
		List<CartItem> itemList = getCartItemList(request);
		for (CartItem cartItem : itemList) {
			if (cartItem.getId().equals(itemId)) {
				itemList.remove(cartItem);
				break;
			}
		}
		CookieUtils.setCookie(request, response, "TT_CART", JsonUtils.objectToJson(itemList), true);
		return WeLifeResult.ok();
	}

	/**
	 * 从cookie中取商品列表
	 */
	private List<CartItem> getCartItemList(HttpServletRequest request) {
		String cartJson = CookieUtils.getCookieValue(request, "TT_CART", true);
		if (cartJson == null) {
			return new ArrayList<>();
		}
		// 把json转换成商品列表
		try {
			return JsonUtils.jsonToList(cartJson, CartItem.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<>();
	}

	@Override
	public List<CartItem> getCartItemList(HttpServletRequest request, HttpServletResponse response) {
		return getCartItemList(request);
	}

	@Override
	public WeLifeResult updateNum(Long itemId, Integer num, HttpServletRequest request) {
		List<CartItem> cartItemList = getCartItemList(request);
		for (CartItem cartItem : cartItemList) {
			if (cartItem.getId().equals(itemId)) {
				cartItem.setNum(num);
			}
		}
		return WeLifeResult.ok();
	}

}
