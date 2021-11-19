package com.baeldung.hexagonal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.baeldung.hexagonal.Account;
import com.baeldung.hexagonal.service.AccountService;

@Controller
@RequestMapping("/account") 
public class AccountController{ 
	
	@Autowired 
	private AccountService accountService; 
	
	 @RequestMapping(method = RequestMethod.POST)
	public void createAccount(@RequestBody Account account) { 
		accountService.createAccount(account); 
	} 
	
	 @RequestMapping(value ="/{accountNumber}", method = RequestMethod.GET) 
	public Account getAccount(@PathVariable Long accountNumber) { 
		return accountService.getAccount(accountNumber);		
	} 
	
	 @RequestMapping(method = RequestMethod.GET)
	public List<Account> allAccounts() { 
		return accountService.allAccounts(); 
	} 
}