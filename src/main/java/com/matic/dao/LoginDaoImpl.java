package com.matic.dao;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.matic.vo.User;

public class LoginDaoImpl extends HibernateDaoSupport implements LoginDao {

	@Override
	public User query(User user) throws Exception {
		
		User user2 = this.getHibernateTemplate().get(User.class,1);
		System.out.println(user2);
		
		
		return null;
	}
	
}
