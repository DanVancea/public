package com.baeldung.hexagonal.service;

import java.util.List;

import com.baeldung.hexagonal.Account;

public interface AccountService { 
	
	void createAccount(Account account); 
	
	Account getAccount(Long accountNumber); 
	
	List<Account> allAccounts(); 
	
}