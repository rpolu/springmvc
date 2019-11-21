package com.elegant.bank.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.elegant.bank.dao.AccountDao;
import com.elegant.bank.entity.Account;
import com.elegant.bank.model.AccountModel;
import com.elegant.bank.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountDao accountDao;
	@Transactional
	public Account getAccountDetails(int accountNumber) {
		return accountDao.getAccountDetails(accountNumber);
	}
	@Transactional
	public void createAccount(Account account) {
		accountDao.createAccount(account);
	}

	@Transactional
	@Override
	public List<AccountModel> getAccounts() {
		List<Account> listEnt = accountDao.getAccounts();
		List<AccountModel> modelList = new ArrayList<AccountModel>();
		for (Account ent : listEnt) {
			AccountModel model = new AccountModel();
			try {
				BeanUtils.copyProperties(model, ent);
			} catch (IllegalAccessException | InvocationTargetException e) {
				e.printStackTrace();
			}
			modelList.add(model);
		}

		return modelList;
	}
    @Transactional
	public void deleteAccount(int accountNumber) {
		accountDao.deleteAccount(accountNumber);
	}

}
