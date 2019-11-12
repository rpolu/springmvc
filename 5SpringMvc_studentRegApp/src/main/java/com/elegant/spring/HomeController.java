package com.elegant.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.elegant.spring.model.StudentModel;
import com.elegant.spring.service.StudentService;

@Controller
public class HomeController {
	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(@ModelAttribute("studentForm") StudentModel studentModel) {
		ModelAndView mv = new ModelAndView("student");
		return mv;
	}

	@RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
	public ModelAndView saveStudent(@ModelAttribute("studentForm") StudentModel studentModel) {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("display");
		return modelAndView;
	}

}
