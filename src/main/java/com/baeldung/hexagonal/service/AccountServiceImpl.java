package com.baeldung.hexagonal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baeldung.hexagonal.Account;
import com.baeldung.hexagonal.repository.AccountRepository;

@Service 
public class AccountServiceImpl implements AccountService { 

	@Autowired 
	private AccountRepository accountRepository; 

	@Override 
	public void createAccount(Account account) { 
		accountRepository.createAccount(account); 
	} 
	
	@Override 
	public Account getAccount(Long accountNumber) { 
		return accountRepository.getAccount(accountNumber); 
	} 
	
	@Override 
	public List<Account> allAccounts() { 
		return accountRepository.allAccounts(); 
	} 
}