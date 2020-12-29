package com.elegant.bank.service;

import java.util.List;

import com.elegant.bank.entity.Account;
import com.elegant.bank.model.AccountModel;

public interface AccountService {
	public Account getAccountDetails(int accountNumber);

	public void createAccount(Account account);

	public abstract List<AccountModel> getAccounts();
	
	public void deleteAccount(int accountNumber);

}
