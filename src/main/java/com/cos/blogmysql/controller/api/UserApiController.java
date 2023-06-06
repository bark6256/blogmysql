package com.cos.blogmysql.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.blogmysql.dto.ResponseDto;
import com.cos.blogmysql.model.RoleType;
import com.cos.blogmysql.model.User;
import com.cos.blogmysql.service.UserService;

@RestController
public class UserApiController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/api/user")
	public ResponseDto<Integer> save(@RequestBody User user) {
		System.out.println("controller save 호출");
		user.setRole(RoleType.USER);
		int result = userService.회원가입(user);
		return new ResponseDto<Integer>(HttpStatus.OK, result);
	}
}
