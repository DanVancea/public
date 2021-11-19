package com.baeldung.hexagonal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baeldung.hexagonal.HexagonalApp;
import com.baeldung.hexagonal.domain.Book;

public class HexagonalServiceImpl implements HexagonalService {
	
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private BookRepository bookRepository;
    
    @Override
    public List getUsers() {
        return userRepository.findAll();
    }
    
    @Override
    public List getBooks() {
        return bookRepository.findAll();
    }
    
}