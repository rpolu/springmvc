package com.elegant.bank.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elegant.bank.dao.AccountDao;
import com.elegant.bank.entity.Account;
import com.elegant.bank.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountDao accountDao;

	public Account getAccountDetails(int accountNumber) {
		return accountDao.getAccountDetails(accountNumber);
	}
	public void createAccount(Account account) {
		accountDao.createAccount(account);
	}

}
