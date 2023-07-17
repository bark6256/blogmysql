package com.cos.blogmysql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.blogmysql.model.User;
import com.cos.blogmysql.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public void 회원가입(User user) {
		userRepository.save(user);
	}
	
	@Transactional(readOnly = true)
	public User 로그인(User user) {
		return userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
	}
}
