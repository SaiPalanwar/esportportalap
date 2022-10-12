package com.app.service;

import com.app.pojos.User;

public interface HomeServiceInterface {

	String registerUser(User user);

	User loginUser(String email, String password);



}
