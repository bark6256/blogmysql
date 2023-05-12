package com.cos.blogmysql.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/user/joinForm")
	public String joinFrom() {
		
		return "user/joinForm";
	}
	
	@GetMapping("/user/loginForm")
	public String loginFrom() {
		
		return "user/loginForm";
	}
}
