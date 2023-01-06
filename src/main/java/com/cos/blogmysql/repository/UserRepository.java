package com.cos.blogmysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.blogmysql.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
}
