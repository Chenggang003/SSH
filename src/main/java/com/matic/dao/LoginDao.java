package com.matic.dao;

import com.matic.vo.User;

public interface LoginDao {

	User query(User user) throws Exception;

}
