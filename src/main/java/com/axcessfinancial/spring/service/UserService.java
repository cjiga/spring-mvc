package com.axcessfinancial.spring.service;

import java.util.List;

import com.axcessfinancial.spring.domain.User;

public interface UserService {
	User getUserByUserName(String userName);
	List<String> getAuthoritiesByUserName(String userName);
}
