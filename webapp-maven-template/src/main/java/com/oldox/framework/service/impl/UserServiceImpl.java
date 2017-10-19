package com.oldox.framework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oldox.framework.dao.UserDao;
import com.oldox.framework.entity.User;
import com.oldox.framework.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public User getById(Long id) {
		return userDao.getById(id);
	}

}
