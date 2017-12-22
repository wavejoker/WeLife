package com.welife.sso.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.welife.common.utils.WeLifeResult;
import com.welife.pojo.WeUser;

/**
 * 用户登录Service
 * 
 * @TODO 实现登录验证码功能
 * @author Creeper
 * @Data 2017年7月29日 下午1:49:14
 *
 */
public interface UseService {

	/**
	 * 检测用户注册信息是否可用
	 * 
	 */
	public WeLifeResult checkData(String content, Integer type);

	/**
	 * 用户注册Service
	 */
	public WeLifeResult creatUser(WeUser user);

	/**
	 * 用户登录Service
	 * @param response 
	 * @param request 
	 */
	public WeLifeResult userLogin(String username, String password, HttpServletRequest request,
                                  HttpServletResponse response);

	/**
	 * 通过token查询用户信息
	 */
	public WeLifeResult getUserByToken(String token);

	/**
	 * 用户安全退出的Service
	 */
	public WeLifeResult userLogout(String token);
}
