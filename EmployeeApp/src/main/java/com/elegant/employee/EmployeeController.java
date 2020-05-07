package com.elegant.employee;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	@RequestMapping(value = "/saveEmp", method = RequestMethod.POST)
	public ModelAndView saveEmp(HttpServletRequest request) {

		String num = request.getParameter("eid");
		String nm = request.getParameter("name");
		String salary = request.getParameter("sal");

		ModelAndView modelAndView = new ModelAndView("empdisplay");
		modelAndView.addObject("n1", num);
		modelAndView.addObject("n2", nm);
		modelAndView.addObject("n3", salary);
		return modelAndView;
	}

}
