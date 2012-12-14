package com.axcessfinancial.spring.dao;

import java.util.List;

import com.axcessfinancial.spring.domain.User;

public interface UserDao {
	public User getUserByUserName(String userName);

	List<String> getAuthoritiesByUserName(String userName);
}
