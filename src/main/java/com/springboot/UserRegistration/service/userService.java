package com.springboot.UserRegistration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.UserRegistration.entity.User;
import com.springboot.UserRegistration.repository.userRepository;

@Service
public class userService {
	@Autowired
	private  userRepository UserRepository;


	public  User saveUser(User User) {
		User user1=UserRepository.save(User);
        return user1;
	}
}
