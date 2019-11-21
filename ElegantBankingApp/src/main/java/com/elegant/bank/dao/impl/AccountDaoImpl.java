package com.elegant.bank.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.elegant.bank.dao.AccountDao;
import com.elegant.bank.entity.Account;

@Repository
public class AccountDaoImpl implements AccountDao {
	@Autowired
	private SessionFactory sessionFactory;

	public Account getAccountDetails(int accountNumber) {
		Account account = (Account) sessionFactory.openSession().get(Account.class, accountNumber);
		return account;
	}

	public void createAccount(Account account) {
		sessionFactory.openSession().save(account);
	}

	public List<Account> getAccounts() {
		Criteria criteria = sessionFactory.openSession().createCriteria(Account.class);
		List<Account> listAccounts = criteria.list();
		return listAccounts;
	}

	public void deleteAccount(int accountNumber) {
		Account eAccount = new Account();
		eAccount.setAccountNumber(accountNumber);
		sessionFactory.openSession().delete(eAccount);
	}
	

}
