package com.anil.mvcproject.mvcjpathymeleaf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anil.mvcproject.mvcjpathymeleaf.repository.UserRepository;

@Service
public class UserService {
	
	private final UserRepository repository;
	
	@Autowired
	public UserService(final UserRepository repository) {
		this.repository = repository;
	}

}
