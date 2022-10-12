package com.app.dao;

import com.app.pojos.User;

public interface HomeDaoInterface {

	String registerUser(User user);

	User loginUser(String email, String password);

}
