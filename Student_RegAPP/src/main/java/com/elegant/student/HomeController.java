package com.elegant.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.elegant.student.model.StudentModel;

@Controller
public class HomeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView openHomePage() {
		ModelAndView modelAndView = new ModelAndView("studentreg");
		modelAndView.addObject("studentCommand", new StudentModel());
		return modelAndView;
	}
}
