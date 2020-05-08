package com.elegant.student.model;
public class StudentModel {
	private Long rollNum;
	private String firstName;
	private String lastName;
	private String address;

	public Long getRollNum() {
		return rollNum;
	}

	public void setRollNum(Long rollNum) {
		this.rollNum = rollNum;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
