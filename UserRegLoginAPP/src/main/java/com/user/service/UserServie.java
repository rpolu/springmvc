package com.user.service;

import org.springframework.stereotype.Service;

@Service
public class UserServie {

	public boolean loginUser(String userName, String password) {
		return userName.equalsIgnoreCase(password);
	}

}
