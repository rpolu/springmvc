package com.user.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import com.user.model.UserModel;

@Repository
public class UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String INSERT_DATA = "INSERT INTO USER_PROFILE VALUES(?,?,?,?,?,?)";

	private static final String QUERY = "SELECT * FROM USER_PROFILE WHERE USERNAME=? AND PASSWORD =?";

	public void saveUser(UserModel userModel) {
		jdbcTemplate.update(INSERT_DATA, userModel.getFirstName(), userModel.getLastName(), userModel.getAddress(),
				userModel.getPhoneNumber(), userModel.getUserName(), userModel.getPassword());
	}

	public boolean validateUser(String userName, String password) {
		SqlRowSet sqlRowSet = jdbcTemplate.queryForRowSet(QUERY, userName, password);

		if (sqlRowSet.next()) {
			return true;
		} else {
			return false;
		}
	}

}
