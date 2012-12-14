package com.axcessfinancial.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.axcessfinancial.spring.domain.Authority;
import com.axcessfinancial.spring.domain.User;

public class UserDaoImpl implements UserDao {
	HibernateTemplate hibernateTemplate;
	private String queryString="from User where username=?";
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate arg0) {
		hibernateTemplate = arg0;
	}

	@Override
	public User getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return (User)hibernateTemplate.find(queryString, userName).get(0);
	}
	
	@Override
	public List<String> getAuthoritiesByUserName(String userName) {
		// TODO Auto-generated method stub
		User u = (User) hibernateTemplate.find(queryString, userName).get(0);
		Authority a = u.getAuthority();
		String auth = a.getAuthority();
		List<String> l = new ArrayList<String>();
		l.add(auth);
		return l;
	}

}
