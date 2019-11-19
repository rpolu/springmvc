package com.elegant.bank.dao;

import com.elegant.bank.entity.Account;

public interface AccountDao {

	public abstract Account getAccountDetails(int accountNumber);

	public abstract void createAccount(Account account);

}
