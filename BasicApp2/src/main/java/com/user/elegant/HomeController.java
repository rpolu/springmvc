package com.user.elegant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value = "/userDisplay", method = RequestMethod.POST)
	public ModelAndView home(HttpServletRequest req) {

		String un = req.getParameter("un");
		String pn = req.getParameter("ph");
		String adr = req.getParameter("addrs");
		
		
		// 

		ModelAndView modelAndView = new ModelAndView("showuser");
		modelAndView.addObject("un", un);
		modelAndView.addObject("pn", pn);
		modelAndView.addObject("ad", adr);

		return modelAndView;
	}

}
