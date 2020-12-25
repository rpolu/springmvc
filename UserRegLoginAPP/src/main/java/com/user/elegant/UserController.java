package com.user.elegant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.user.model.UserModel;
import com.user.service.UserServie;

@Controller
public class UserController {

	@Autowired
	private UserServie userServie;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		return new ModelAndView("home", "userCommand", new UserModel());
	}

	@RequestMapping(value = "/userReg", method = RequestMethod.GET)
	public ModelAndView openSingUP() {
		return new ModelAndView("userSignUp", "userCommand", new UserModel());
	}

	@RequestMapping(value = "/loginUser", method = RequestMethod.POST)
	public ModelAndView loginUser(@ModelAttribute("userCommand") UserModel userModel, BindingResult bindingResult) {
		String userName = userModel.getUserName();
		String password = userModel.getPassword();

		if (userName == null || userName.trim().equals("")) {
			bindingResult.rejectValue("userName", "", "User Name is Required");
		}

		if (password == null || password.trim().equals("")) {
			bindingResult.rejectValue("password", "", "Password id required");
		}

		if (bindingResult.hasErrors()) {
			return new ModelAndView("home");
		}

		boolean flag = userServie.validateUser(userName, password);
		if (flag)
			return new ModelAndView("loginSuccess");
		else
			return new ModelAndView("loginFail");
	}

	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute("userCommand") UserModel userModel, BindingResult bindingResult) {

		if (userModel.getFirstName() == null || userModel.getFirstName().trim().equals("")) {
			bindingResult.rejectValue("firstName", "", "First Name is Required");
		}
		if (userModel.getLastName() == null || userModel.getLastName().trim().equals("")) {
			bindingResult.rejectValue("lastName", "", "Last Name is Required");
		}

		if (userModel.getAddress() == null || userModel.getAddress().trim().equals("")) {
			bindingResult.rejectValue("address", "", "Address is Required");
		}

		if (userModel.getPhoneNumber() == null || userModel.getPhoneNumber().trim().equals("")) {
			bindingResult.rejectValue("phoneNumber", "", "Phone Number is Required");
		}

		if (userModel.getUserName() == null || userModel.getUserName().trim().equals("")) {
			bindingResult.rejectValue("userName", "", "User Name is Required");
		}

		if (userModel.getPassword() == null || userModel.getPassword().trim().equals("")) {
			bindingResult.rejectValue("password", "", "Password id required");
		}

		if (bindingResult.hasErrors()) {
			return new ModelAndView("userSignUp");
		}
		userServie.saveUser(userModel);
		return new ModelAndView("home", "userCommand", new UserModel());
	}

}
