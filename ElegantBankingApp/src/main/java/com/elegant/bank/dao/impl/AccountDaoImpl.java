package com.elegant.bank.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
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
		Account account = (Account) sessionFactory.getCurrentSession().get(Account.class, accountNumber);
		return account;
	}

	public void createAccount(Account account) {
		Session session = sessionFactory.getCurrentSession();
		if (account.getAccountNumber() != 0) {
			session.update(account);
		} else {
			session.save(account);
		}
	}

	public List<Account> getAccounts() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Account.class);
		List<Account> listAccounts = criteria.list();
		return listAccounts;
	}

	public void deleteAccount(int accountNumber) {
		Session session = sessionFactory.getCurrentSession();
		Account eAccount = new Account();
		eAccount.setAccountNumber(accountNumber);
		session.delete(eAccount);
	}

}
