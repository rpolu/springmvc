package com.elegant.bank.service;

import com.elegant.bank.entity.Account;

public interface AccountService {
	public Account getAccountDetails(int accountNumber);

	public void createAccount(Account account);
}
