package com.welife.portal.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.welife.common.utils.CookieUtils;
import com.welife.pojo.WeUser;
import com.welife.portal.service.UserService;
import com.welife.portal.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


public class LoginInterceptor implements HandlerInterceptor{

	@Autowired
	private UserService userService;
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//在handel执行之前处理
		//判断用户是否登录
		//从cookie中取token
		String token = CookieUtils.getCookieValue(request, "TT_TOKEN");
		//根据token获取用户信息调用SSO系统接口
		WeUser user = userService.getUserByToken(token);
		//取不到用户信息
		if (null == user) {
			//跳转到登录页面,把用户请求的URL当做参数传递给登录页面
			response.sendRedirect(userService.SSO_BASE_URL + userService.SSO_USER_LOGIN + "?redirect=" + request.getRequestURL());
			return false;
		}
		//返回值决定Handel是否执行 true:执行, false:不执行
		//取到用户信息,放行
		//将用户信息放入request
		request.setAttribute("user", user);
		return true;
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
