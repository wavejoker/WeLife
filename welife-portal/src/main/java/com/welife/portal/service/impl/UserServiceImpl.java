package com.welife.portal.service.impl;

import com.welife.common.utils.HttpClientUtil;
import com.welife.common.utils.WeLifeResult;
import com.welife.pojo.WeUser;
import com.welife.portal.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

	@Value("${SSO_BASE_URL}")
	public String SSO_BASE_URL;
	@Value("${SSO_USER_TOKEN}")
	private String SSO_USER_TOKEN;
	@Value("${SSO_USER_LOGIN}")
	public String SSO_USER_LOGIN;
	
	@Override
	public WeUser getUserByToken(String token) {
		try {
			
		
		// 调用SSO系统的服务,根据token获取用户信息
		String json = HttpClientUtil.doGet(SSO_BASE_URL + SSO_USER_TOKEN + token);
		// 把Json转换成TaotaoResult
			WeLifeResult result = WeLifeResult.formatToPojo(json, WeUser.class);
		if (result.getStatus() == 200) {
			WeUser user = (WeUser) result.getData();
			return user;
		}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
