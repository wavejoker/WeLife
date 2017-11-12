package com.welife.portal.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.welife.common.utils.WeLifeResult;
import com.welife.portal.pojo.CartItem;
import com.welife.portal.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 购物车管理Controller
 *
 * @author Creeper
 * @Data 2017年8月3日 下午4:20:27
 */
@Controller
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @RequestMapping("/add/{productId}")
    public String addCartItem(@PathVariable Long productId, @RequestParam(defaultValue = "1") Integer num,
                              HttpServletRequest request, HttpServletResponse response) {
        cartService.addCartItem(productId, num, request, response);
        return "redirect:/cart/addSuccess.html";
    }

    @RequestMapping("/delete/{productId}")
    public String deleteCartItem(@PathVariable Long productId, HttpServletRequest request, HttpServletResponse response) {
        cartService.deleteCartItem(productId, request, response);
        return "redirect:/cart/cart.html";
    }

    @RequestMapping("addSuccess")
    public String showSuccess() {
        return "cartSuccess";
    }

    @RequestMapping("/cart")
    public String showCart(HttpServletRequest request, HttpServletResponse response, Model model) {
        List<CartItem> list = cartService.getCartItemList(request, response);
        model.addAttribute("cartList", list);
        return "cart";
    }

    /**
     * 通过文本框直接修改商品数量
     */
    @RequestMapping(value = "/updateNum/{productId}/{num}", method = RequestMethod.POST)
    @ResponseBody
    public WeLifeResult updateNum(@PathVariable Long productId, @PathVariable Integer num, HttpServletRequest request) {
        WeLifeResult result = cartService.updateNum(productId, num, request);
        return result;
    }

}
