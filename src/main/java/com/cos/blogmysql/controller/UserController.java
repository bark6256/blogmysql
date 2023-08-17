package com.cos.blogmysql.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	// "/auth"로 시작하는 경로, /css, /js, /image 경로 허용
	// 그냥 주소가 /면 index.jsp 허용
	@GetMapping("/auth/joinForm")
	public String joinFrom() {
		
		return "user/joinForm";
	}
	
	@GetMapping("/auth/loginForm")
	public String loginFrom() {
		
		return "user/loginForm";
	}
}
