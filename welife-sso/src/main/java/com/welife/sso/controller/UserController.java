package com.welife.sso.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.welife.common.utils.ExceptionUtil;
import com.welife.common.utils.WeLifeResult;
import com.welife.pojo.WeUser;
import com.welife.sso.service.UseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 用户Controller
 * 
 * @TODO不是很懂
 * @author Creeper
 * @Data 2017年7月29日 下午6:07:45
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UseService useService;

	/**
	 * 跳转到登录页面
	 */
	@RequestMapping("/showLogin")
	public String showLogin(String redirect, Model model) {
		model.addAttribute("redirect", redirect);
		return "login";
	}

	/**
	 * 跳转到注册页面
	 */
	@RequestMapping("/showRegister")
	public String showRegister() {
		return "register";

	}

	/**
	 * 数据校验Controller
	 */
	@RequestMapping("/check/{param}/{type}")
	@ResponseBody
	public Object chackData(@PathVariable String param, @PathVariable Integer type, String callback) {
		WeLifeResult result = null;
		// 参数有效性校验
		if (StringUtils.isBlank(param)) {
			result = WeLifeResult.build(400, "校验内容不能为空");
		}
		if (type == null) {
			result = WeLifeResult.build(400, "校验类型不能为空");
		}
		if (type != 1 && type != 2 && type != 3) {
			result = WeLifeResult.build(400, "校验内容类型错误");
		}

		// 校验出错
		if (null != result) {
			if (null != callback) {
				MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(result);
				mappingJacksonValue.setJsonpFunction(callback);
				return mappingJacksonValue;
			} else {
				return result;
			}
		}
		// 调用服务
		try {
			result = useService.checkData(param, type);
		} catch (Exception e) {
			result = WeLifeResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		if (null != callback) {
			MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(result);
			mappingJacksonValue.setJsonpFunction(callback);
			return mappingJacksonValue;
		} else {
			return result;
		}
	}

	/**
	 * 用户注册controller
	 */
	@RequestMapping("/register")
	@ResponseBody
	public WeLifeResult creatUser(WeUser user) {
		try {
			WeLifeResult result = useService.creatUser(user);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return WeLifeResult.build(500, ExceptionUtil.getStackTrace(e));
		}

	}

	/**
	 * 用户登录Controller
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public WeLifeResult userLogin(String username, String password, HttpServletRequest request,
			HttpServletResponse response) {
		try {
			WeLifeResult result = useService.userLogin(username, password, request, response);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return WeLifeResult.build(500, ExceptionUtil.getStackTrace(e));
		}

	}

	/**
	 * 通过token获取用户信息Controller
	 */
	@RequestMapping("/token/{token}")
	@ResponseBody
	public Object getUserByToken(@PathVariable String token, String callback) {
		WeLifeResult result = null;

		try {
			result = useService.getUserByToken(token);
		} catch (Exception e) {
			e.printStackTrace();
			result = WeLifeResult.build(500, ExceptionUtil.getStackTrace(e));
		}

		if (StringUtils.isBlank(callback)) {
			return result;
		} else {
			MappingJacksonValue jacksonValue = new MappingJacksonValue(result);
			jacksonValue.setJsonpFunction(callback);
			return jacksonValue;
		}
	}

	/**
	 * 用户安全退出的Controller
	 */
	@RequestMapping("/logout/{token}")
	@ResponseBody
	public Object userLogout(@PathVariable String token, String callback) {
		WeLifeResult result = null;
		try {
			result = useService.userLogout(token);
		} catch (Exception e) {
			e.printStackTrace();
			result = WeLifeResult.build(500, ExceptionUtil.getStackTrace(e));
		}

		if (StringUtils.isBlank(callback)) {
			return result;
		} else {
			MappingJacksonValue jacksonValue = new MappingJacksonValue(result);
			jacksonValue.setJsonpFunction(callback);
			return jacksonValue;
		}
	}
}
