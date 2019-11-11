package com.spring.mvc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.spring.mvc.model.User;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("user");
		modelAndView.addObject("userForm", new User());
		return modelAndView;
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute("userForm") User user) {
		ModelAndView modelAndView = new ModelAndView("userDispaly");
		return modelAndView;
	}

}
