package com.oldox.framework.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oldox.framework.dao.UserDao;
import com.oldox.framework.entity.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public User getById(Long id) {
		
		return (User)sessionFactory.getCurrentSession().get(User.class, id);
	}

}
