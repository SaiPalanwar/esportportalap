package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.HomeDaoInterface;
import com.app.pojos.User;

@Service
@Transactional
public class HomeService implements HomeServiceInterface {

	@Autowired
	private HomeDaoInterface homeDao;

	@Override
	public String registerUser(User user) {
		
		return homeDao.registerUser(user);
		
	}

	@Override
	public User loginUser(String email, String password) {
		// TODO Auto-generated method stub
		return homeDao.loginUser(email, password);
	}
}
