package com.spring.elegant.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class StudentModel {
	@NotEmpty(message = "First Name is required.")
	private String firstName;

	@NotEmpty(message = "Email is required.")
	@Email(message = "Email is invalid.")
	private String email;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
