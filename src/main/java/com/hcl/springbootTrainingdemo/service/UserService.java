package com.hcl.springbootTrainingdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.springbootTrainingdemo.entity.User;
import com.hcl.springbootTrainingdemo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public String saveUser(User user) {
		userRepository.save(user);
		return "added successfully";
	}

}
