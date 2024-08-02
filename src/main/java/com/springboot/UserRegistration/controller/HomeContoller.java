package com.springboot.UserRegistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.UserRegistration.entity.User;
import com.springboot.UserRegistration.service.userService;

@RestController
public class HomeContoller {
	@Autowired
	private userService UserService;

	@GetMapping("/")
	public String home() {
		return "Welcome to Spring Boot Registration Process";
	}

	@PostMapping("/saveUser")
	public User SaveUser(@RequestBody User user) {
		User user1 = UserService.saveUser(user);
		return user1;
	}
}
