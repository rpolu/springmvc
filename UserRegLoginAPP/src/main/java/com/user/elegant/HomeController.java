package com.user.elegant;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.user.model.UserModel;
import com.user.service.UserServie;

@Controller
public class HomeController {

	@Autowired
	private UserServie userServie;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(Locale locale, Model model) {
		return new ModelAndView("home", "userCommand", new UserModel());
	}

	@RequestMapping(value = "/loginUser", method = RequestMethod.POST)
	public ModelAndView loginUser(UserModel userModel) {
		String userName = userModel.getUserName();
		String password = userModel.getPassword();
		boolean flag = userServie.loginUser(userName, password);
		if (flag)
			return new ModelAndView("loginSuccess");
		else
			return new ModelAndView("home", "userCommand", new UserModel());
	}

}
