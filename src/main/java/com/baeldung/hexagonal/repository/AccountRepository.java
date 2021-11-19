package com.baeldung.hexagonal.repository;

import java.util.List;

import com.baeldung.hexagonal.Account;

public interface AccountRepository { 
	
    void createAccount(Account account); 
    
    Account getAccount(Long accountNumber); 
    
    List allAccounts();
    
}