package com.matic.service;

import org.springframework.transaction.annotation.Transactional;
import com.matic.dao.LoginDao;
import com.matic.vo.User;

@Transactional
public class LoginServiceImpl implements LoginService {
	private LoginDao loginDao;
	@Override
	public boolean query(User user) throws Exception {
		boolean b = true;
		User user2 = loginDao.query(user);
		if(user2 == null){
			b = false;
		}
		return b;
	}
	
	
	
	public LoginDao getLoginDao() {
		return loginDao;
	}
	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}
	
}
