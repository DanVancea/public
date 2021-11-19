package com.baeldung.hexagonal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baeldung.hexagonal.service.HexagonalService;

@RestController
public class HexagonalAppController {
	
    @Autowired
    HexagonalService hexService;
    
    @GetMapping
    public List getBooksForUser(){
    	
        return hexService.getUsers();
    }
}