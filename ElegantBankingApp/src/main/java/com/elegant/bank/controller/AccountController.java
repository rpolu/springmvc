package com.elegant.bank.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.elegant.bank.entity.Account;
import com.elegant.bank.model.AccountModel;
import com.elegant.bank.service.AccountService;

@Controller
@RequestMapping("/account")
public class AccountController {
	@Autowired
	private AccountService accountService;

	@RequestMapping(value = "getaccount", method = RequestMethod.GET)
	public ModelAndView homeAccouunDetails() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("accounNumInput");
		return modelAndView;
	}

	@RequestMapping(value = "addcountinput", method = RequestMethod.GET)
	public ModelAndView homeAccouunInput(@ModelAttribute("accoungform") AccountModel model) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("accouncreateInput");
		return modelAndView;
	}

	@RequestMapping(value = "saveAccount", method = RequestMethod.POST)
	public ModelAndView saveAccount(@ModelAttribute("accoungform") AccountModel model) {
		Account account = new Account();
		try {
			BeanUtils.copyProperties(account, model);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		accountService.createAccount(account);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("accounNumInput");
		return modelAndView;
	}

	@RequestMapping(value = "getDetails", method = RequestMethod.GET)
	public ModelAndView getAccountDetails(@RequestParam("accountnum") String accountNum) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("accounDisplay");
		Account account = accountService.getAccountDetails(Integer.parseInt(accountNum));
		modelAndView.addObject("acc", account);
		return modelAndView;
	}

	@RequestMapping(value = "getallaccounts", method = RequestMethod.GET)
	public ModelAndView manageAccounts() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("manageaccounts");
		List<AccountModel> models = accountService.getAccounts();
		modelAndView.addObject("accList", models);
		return modelAndView;
	}

	@RequestMapping(value = "delete/{accnum}", method = RequestMethod.GET)
	public ModelAndView deleteAccount(@PathVariable("accnum") String accountNum) {
		accountService.deleteAccount(Integer.parseInt(accountNum));
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("manageaccounts");
		List<AccountModel> models = accountService.getAccounts();
		modelAndView.addObject("accList", models);
		return modelAndView;
	}
	
	@RequestMapping(value = "update/{accnum}", method = RequestMethod.GET)
	public ModelAndView updateAccount(@PathVariable("accnum") String accountNum) {
		ModelAndView modelAndView = new ModelAndView();
		Account account = accountService.getAccountDetails(Integer.parseInt(accountNum));
		modelAndView.addObject("accoungform", account);
		modelAndView.setViewName("accouncreateInput");
		return modelAndView;
	}

}
