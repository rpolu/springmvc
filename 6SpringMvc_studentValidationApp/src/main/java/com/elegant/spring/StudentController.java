package com.elegant.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.elegant.spring.model.StudentModel;
import com.elegant.spring.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(@ModelAttribute("studentForm") StudentModel studentModel) {
		ModelAndView mv = new ModelAndView("student");
		return mv;
	}

	@RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
	public ModelAndView saveStudent(@ModelAttribute("studentForm") StudentModel studentModel,
			BindingResult bindingResult) {

		validateForm(studentModel, bindingResult);

		if (bindingResult.hasErrors()) {
			ModelAndView mv = new ModelAndView("student");
			return mv;
		} else {
			studentService.saveStudent(studentModel);
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("display");
			return modelAndView;
		}
	}

	private void validateForm(StudentModel studentModel, BindingResult bindingResult) {
		if (studentModel.getFirstName() == null || studentModel.getFirstName().trim().equals("")) {
			bindingResult.rejectValue("firstName", "firstname.required");
		} else if (studentModel.getFirstName().length() <= 4) {
			bindingResult.rejectValue("firstName", "firstname.length", "First name is invalid.");
		}

		if (studentModel.getLastName() == null || studentModel.getLastName().trim().equals("")) {
			bindingResult.rejectValue("lastName", "lastname.required", "Last name is required.");
		}
		if (studentModel.getAddress() == null || studentModel.getAddress().trim().equals("")) {
			bindingResult.rejectValue("address", "address.required", "Address is required.");
		}

	}

}
