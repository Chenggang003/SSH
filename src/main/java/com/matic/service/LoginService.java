package com.matic.service;

import com.matic.vo.User;

public interface LoginService {

	boolean query(User user) throws Exception;

	void save(User user);

}
