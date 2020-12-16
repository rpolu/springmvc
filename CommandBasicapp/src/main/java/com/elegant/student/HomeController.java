package com.elegant.student;

import javax.servlet.ServletContext;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView homePage(ServletContext context) {
		ModelAndView modelAndView = new ModelAndView("student", "stuComand", new StudentModel());
		return modelAndView;
	}

	@RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute("sm") StudentModel studentModel) {
		return "success";
	}

}
