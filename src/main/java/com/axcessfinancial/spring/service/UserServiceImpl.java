package com.axcessfinancial.spring.service;

import java.util.List;

import com.axcessfinancial.spring.dao.UserDao;
import com.axcessfinancial.spring.domain.User;

public class UserServiceImpl implements UserService {
	UserDao userDao;

	public User getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return userDao.getUserByUserName(userName);
	}

	@Override
	public List<String> getAuthoritiesByUserName(String userName) {
		// TODO Auto-generated method stub
		return userDao.getAuthoritiesByUserName(userName);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
