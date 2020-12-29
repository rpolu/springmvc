package com.elegant.bank.dao;

import java.util.List;

import com.elegant.bank.entity.Account;

public interface AccountDao {

	public abstract Account getAccountDetails(int accountNumber);

	public abstract void createAccount(Account account);

	public abstract List<Account> getAccounts();
	
	public void deleteAccount(int accountNumber);

}
