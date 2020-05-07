package com.elegant.person;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonController {
	@RequestMapping("/")
	public String openHomePage() {
		return "personinput";
	}

	@RequestMapping(value = "/displayPerson", method = RequestMethod.POST)
	public ModelAndView savePersonDetails(@RequestParam("nm") String name,
			                              @RequestParam("addrs") String address,
			                              @RequestParam String age) {
		
		ModelAndView modelAndView=new  ModelAndView("personDisplay");
		modelAndView.addObject("n1",name);
		modelAndView.addObject("n2",address);
		modelAndView.addObject("n3",age);
		
		return modelAndView;
	}
}
