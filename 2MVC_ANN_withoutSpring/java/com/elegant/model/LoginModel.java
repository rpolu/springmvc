package com.elegant.model;

public class LoginModel {

	public boolean validateUser(String userName, String password) {
		return userName.equalsIgnoreCase(password);
	}

}
