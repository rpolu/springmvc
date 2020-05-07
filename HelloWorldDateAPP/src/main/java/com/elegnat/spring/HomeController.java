package com.elegnat.spring;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value = "/greetme", method = RequestMethod.GET)
	public ModelAndView displayHellowWorldDate() {
		ModelAndView view = new ModelAndView("home");
		view.addObject("message", "Hellow World");
		view.addObject("todayDate", new Date());
		return view;
	}
}
