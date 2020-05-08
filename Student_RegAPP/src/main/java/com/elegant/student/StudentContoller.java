package com.elegant.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.elegant.student.model.StudentModel;

@Controller
public class StudentContoller {
	@RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
	public ModelAndView displayStudent(StudentModel student) {
		return new ModelAndView("display", "sm", student);
	}
}
