package com.baeldung.hexagonal.notifier;

public interface NotifierService {
	
    void emailSend();
    
    void smsSend();
    
}