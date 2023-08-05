package com.pesu.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pesu.demo.model.User;
import com.pesu.demo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository repository;
	
//	public Optional<User> findUserById(String Id) {
//		return repository.findById(Id);
//	}
//	

}
