package com.springboot.UserRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.UserRegistration.entity.User;

@Repository
public interface userRepository extends JpaRepository<User, Integer> {

}
