package com.elegnat.accoutapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountController {
	@RequestMapping(value = "/accsave", method = RequestMethod.POST)
	public ModelAndView saveAccount(@ModelAttribute("ac") AccountCommad accModel) {
		return new ModelAndView("accdis");
	}

}
