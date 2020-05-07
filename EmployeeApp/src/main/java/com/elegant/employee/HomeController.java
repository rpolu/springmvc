package com.elegant.employee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	@RequestMapping("/")
	public ModelAndView openHomePage() {
		return new ModelAndView("home");
	}
}
