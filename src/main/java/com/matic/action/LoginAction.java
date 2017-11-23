package com.matic.action;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.matic.service.LoginService;
import com.matic.vo.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class LoginAction extends ActionSupport implements ModelDriven<User>{
	private static Logger logger = LogManager.getLogger(LoginAction.class);
	
	private User user = new User();
	private LoginService loginService;
	
	public String init(){
		String result = "success";
		try {
			user.setId(1);
			if(!loginService.query(user)){
				result = "error";
			}
		} catch (Exception e) {
			logger.error("发生错误!" + e);
			e.printStackTrace();
		}
		return result;
	}
	

	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	@Override
	public User getModel() {
		return user;
	}
}
