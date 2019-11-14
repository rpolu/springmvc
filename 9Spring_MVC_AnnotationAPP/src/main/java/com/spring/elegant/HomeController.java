package com.spring.elegant;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.elegant.model.StudentModel;

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(@ModelAttribute("studentForm") StudentModel model) {
		ModelAndView modelAndView = new ModelAndView("student");
		return modelAndView;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveStudent(@ModelAttribute("studentForm") @Valid StudentModel model, BindingResult br) {
		if (br.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView("student");
			return modelAndView;
		} else {
			
			//
			
			
			ModelAndView modelAndView = new ModelAndView("success");
			return modelAndView;
		}
	}

}
