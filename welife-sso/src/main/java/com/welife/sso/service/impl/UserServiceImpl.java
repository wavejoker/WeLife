package com.welife.sso.service.impl;

import com.welife.common.utils.CookieUtils;
import com.welife.common.utils.JsonUtils;
import com.welife.common.utils.WeLifeResult;
import com.welife.mapper.WeUserMapper;
import com.welife.pojo.WeUser;
import com.welife.pojo.WeUserExample;
import com.welife.sso.dao.JedisClient;
import com.welife.sso.service.UseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UseService {

	@Autowired
	private WeUserMapper userMapper;
	@Autowired
	private JedisClient jedisClient;

	@Value("${REDIS_USER_SESSION_KEY}")
	private String REDIS_USER_SESSION_KEY;
	@Value("${SSO_SESSION_EXPIRE}")
	private Integer SSO_SESSION_EXPIRE;

	@Override
	public WeLifeResult checkData(String content, Integer type) {
		// 创建查询条件

		WeUserExample example = new WeUserExample();
		WeUserExample.Criteria criteria = example.createCriteria();
		if (1 == type) {
			// 创建验证用户名的查询条件
			criteria.andUsernameEqualTo(content);
		} else if (2 == type) {
			// 创建验证手机是否可用的查询条件
			criteria.andPhoneEqualTo(content);
		} else {
			// 创建验证邮箱是否可用的查询条件
			criteria.andEmailEqualTo(content);
		}
		List<WeUser> list = userMapper.selectByExample(example);
		if (list == null || list.size() == 0) {
			return WeLifeResult.ok(true);
		}
		return WeLifeResult.ok(false);
	}

	@Override
	public WeLifeResult creatUser(WeUser user) {
		user.setCreatetime(new Date());
		user.setExp(0L);
		user.setSex(0);
		user.setStatus(1);
		user.setIdentity("");
		user.setCreatetime(new Date());
		user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
		int flag = userMapper.insert(user);
		System.out.println( flag);
		return WeLifeResult.ok();
	}

	@Override
	public WeLifeResult userLogin(String username, String password, HttpServletRequest request, HttpServletResponse response) {
		// 创建查询条件
		WeUserExample example = new WeUserExample();
		WeUserExample.Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		// 检测是否存在该用户名,如果存在,则将密码进行比对,不存在则返回错误信息
		List<WeUser> list = userMapper.selectByExample(example);
		// 如果不存在该用户名
		if (null == list || list.size() == 0) {
			return WeLifeResult.build(400, "用户名或密码错误");
		}
		WeUser user = list.get(0);
		// 对比密码
		if (!DigestUtils.md5DigestAsHex(password.getBytes()).equals(user.getPassword())) {
			WeLifeResult.build(400, "用户名或密码错误");
		}
		// 生成token
		String token = UUID.randomUUID().toString();
		// 在保存用户信息之前清空用户密码
		user.setPassword(null);
		// 把用户信息写入Redis
		jedisClient.set(REDIS_USER_SESSION_KEY + ":" + token, JsonUtils.objectToJson(user));
		// 设置session的过期时间
		jedisClient.expire(REDIS_USER_SESSION_KEY + ":" + token, SSO_SESSION_EXPIRE);
		//将token写入Cookie
		CookieUtils.setCookie(request, response, "TT_TOKEN", token);
		// 返回token
		return WeLifeResult.ok(token);
	}

	@Override
	public WeLifeResult getUserByToken(String token) {
		// 根据token从redis中查询用户信息
		String json = jedisClient.get(REDIS_USER_SESSION_KEY + ":" + token);
		// 判断是否为空
		if (StringUtils.isBlank(json)) {
			return WeLifeResult.build(400, "此Session已过期,请重新登录");
		}
		// 如果用户有其他操作,则更新Session过期时间
		jedisClient.expire(REDIS_USER_SESSION_KEY + ":" + token, SSO_SESSION_EXPIRE);
		// 返回用户信息
		return WeLifeResult.ok(JsonUtils.jsonToPojo(json, WeUser.class));
	}

	@Override
	public WeLifeResult userLogout(String token) {
		// 将该token才能够redis中删除,即设置过期时间为0
		jedisClient.expire(REDIS_USER_SESSION_KEY + ":" + token, 0);
		return WeLifeResult.ok();
	}

}
