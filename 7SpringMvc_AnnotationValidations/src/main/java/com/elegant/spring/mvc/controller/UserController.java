package com.elegant.spring.mvc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.elegant.spring.mvc.model.UserModel;

@Controller
public class UserController {

	@GetMapping("/")
	public ModelAndView userForm(@ModelAttribute("userForm") UserModel userModel) {
		ModelAndView modelAndView = new ModelAndView("user");
		return modelAndView;
	}

	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute("userForm") @Valid UserModel user, BindingResult result, Model model) {

		if (result.hasErrors()) {
			return "user";
		}
		return "success";
	}
}
