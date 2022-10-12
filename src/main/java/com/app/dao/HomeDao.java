package com.app.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.User;

@Repository
public class HomeDao implements HomeDaoInterface {

	@Autowired
	private EntityManager mgr;

	@Override
	public String registerUser(User user) {
		mgr.persist(user);
		return "User Registred Successfully";
	}

	@Override
	public User loginUser(String email, String password) {
		try {
			String jpql = "select u from User u where u.email=:email1 and u.password=:password1";
			User user = mgr.createQuery(jpql, User.class).setParameter("email1", email).setParameter("password1", password)
					.getSingleResult();
			if(user!=null)
				return user;
			return null;
		} catch (Exception e) {
			return null;
		}
		
	}
}
