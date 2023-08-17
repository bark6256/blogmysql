package com.cos.blogmysql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.blogmysql.model.RoleType;
import com.cos.blogmysql.model.User;
import com.cos.blogmysql.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Transactional
	public void 회원가입(User user) {
		String rawPassword = user.getPassword();
		String encPAssword = encoder.encode(rawPassword);
		user.setPassword(encPAssword);
		user.setRole(RoleType.USER);
		userRepository.save(user);
	}
	
}
