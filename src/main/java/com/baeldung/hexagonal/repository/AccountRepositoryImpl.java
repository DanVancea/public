package com.baeldung.hexagonal.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.baeldung.hexagonal.Account;

@Repository 
public class AccountRepositoryImpl implements AccountRepository { 
	
	private Map<Long, Account> accountMap = new HashMap<Long, Account>(); 
	
	@Override 
	public void createAccount(Account account) { 
		accountMap.put(account.getAccountNumber(), account); 
	} 
	
	@Override 
	public Account getAccount(Long accountNumber) { 
		return accountMap.get(accountNumber); 
	} 
	
	@Override 
	public List<Object> allAccounts() { 
		return accountMap.values().stream().collect(Collectors.toList()); 
	} 
}