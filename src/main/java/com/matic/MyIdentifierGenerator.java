package com.matic;

import java.io.Serializable;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import com.matic.vo.User;

public class MyIdentifierGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		User user = (User)object;
		if (user.getId() != null && user.getId().length() == 32) {
			return user.getId();
		} else {
			return UUID.randomUUID().toString().replace("-","");
		}
	}
}
