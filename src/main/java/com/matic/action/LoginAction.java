package com.matic.action;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.matic.service.LoginService;
import com.matic.vo.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class LoginAction extends ActionSupport implements ModelDriven<User>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static Logger logger = LogManager.getLogger(LoginAction.class);
	
	private User user = new User();
	private LoginService loginService;
	
	public String init(){
		User user = new User();
//		user.setId("4");
		user.setUsername("zhangsan");
		user.setPassword("123123");
		loginService.save(user);
		return null;
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
