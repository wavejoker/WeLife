package com.welife.portal.service;


import com.welife.pojo.WeUser;

/**
 * 用户管理Service
 *
 * @author Creeper
 * @Data 2017年8月2日 下午6:17:58
 *
 */

public interface UserService {

	/**
	 * 根据token获取用户信息
	 */
	WeUser getUserByToken(String token);
}
