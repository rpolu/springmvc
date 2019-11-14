package com.elegant.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.elegant.model.LoginModel;

public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		LoginModel loginModel = new LoginModel();
		loginModel.setUserName(userName);
		loginModel.setPassword(password);
		boolean flag = loginModel.validateUser();
		if (flag) {
			request.getRequestDispatcher("/sucess.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}

	}

}
