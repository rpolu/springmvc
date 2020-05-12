package com.elegnat.accoutapp;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountController {
	@RequestMapping(value = "/accsave", method = RequestMethod.POST)
	public ModelAndView saveAccount(@ModelAttribute("accountCommand") AccountCommad accModel,
			BindingResult bindingResult) {
		validateAccount(accModel, bindingResult);

		if (bindingResult.hasErrors()) {
			return new ModelAndView("acconyInput");
		}

		return new ModelAndView("accdis");
	}

	private void validateAccount(AccountCommad accModel, BindingResult bindingResult) {
		if (accModel.getName() == null || accModel.getName().trim().equals("")) {
			bindingResult.rejectValue("name","name.empty");
		}

		if (accModel.getBalance() == null) {
			bindingResult.rejectValue("balance", null, "Please enter the Balance.");
		} else if (accModel.getBalance() < 1000) {
			bindingResult.rejectValue("balance", null, "Please enter the Balance minium 1000.");
		}

		if (accModel.getBranch() == null || accModel.getBranch().trim().equals("")) {
			bindingResult.rejectValue("branch", null, "Please enter the Branch.");
		} else if (accModel.getBranch().length() < 10) {
			bindingResult.rejectValue("branch", null, "Please Branch name is minium 10 chars.");
		}

		if (accModel.getAddress() == null || accModel.getAddress().trim().equals("")) {
			bindingResult.rejectValue("address", null, "Please enter the address.");

		}
	}

}
