package com.elegant.spring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView openHomePage() {
		ModelAndView modelAndView = new ModelAndView("addinput");
		return modelAndView;
	}

	@RequestMapping(value = "/addnums", method = RequestMethod.POST)
	public ModelAndView addNums(HttpServletRequest request) {
		int num1 = Integer.parseInt(request.getParameter("n1"));
		int num2 = Integer.parseInt(request.getParameter("n2"));
		int sum = num1 + num2;
		ModelAndView view = new ModelAndView("result");
		view.addObject("s", sum);
		return view;
	}
}
