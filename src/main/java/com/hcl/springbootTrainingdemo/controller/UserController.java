package com.hcl.springbootTrainingdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.springbootTrainingdemo.entity.User;
import com.hcl.springbootTrainingdemo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/all")
	public ResponseEntity getAllUser() {
		List<User> users = userService.getAllUsers();
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity saveUser(@RequestBody User user) {
		String msg = userService.saveUser(user);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

}
