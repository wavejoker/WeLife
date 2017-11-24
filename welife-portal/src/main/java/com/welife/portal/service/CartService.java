package com.welife.portal.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.welife.common.utils.WeLifeResult;
import com.welife.portal.pojo.CartItem;

/**
 * 购物车Service
 *
 * @author Creeper
 * @TODO
 * @Data 2017年8月3日 上午11:31:27
 */
public interface CartService {

    /**
     * 添加购物车商品
     */
    WeLifeResult addCartItem(Long itemId, Integer num, HttpServletRequest request, HttpServletResponse response);

    /**
     * 删除购物车商品
     */
    WeLifeResult deleteCartItem(Long itemId, HttpServletRequest request, HttpServletResponse response);

    /**
     * 获取购物车商品列表
     */
    List<CartItem> getCartItemList(HttpServletRequest request, HttpServletResponse response);

    /**
     * 通过文本框修改商品数量
     */
    WeLifeResult updateNum(Long itemId, Integer num, HttpServletRequest request);
}
