package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.dao.UserDao;
import com.user.model.UserModel;

@Service
public class UserServie {
	@Autowired
	private UserDao userDao;

	public void saveUser(UserModel userModel) {
		userDao.saveUser(userModel);
	}

	public boolean validateUser(String userName, String password) {
		return userDao.validateUser(userName, password);
	}

}
