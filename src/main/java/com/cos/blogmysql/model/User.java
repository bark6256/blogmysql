package com.cos.blogmysql.model;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity // User 클래스가 MySQL에 테이블로 생성된다.
//@DynamicInsert   insert할때 null인 필드는 명령어에서 생략된다(default값을 위한 작업)
public class User {

	@Id // 기본키
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 프로젝트에서 연결된 DB의 넘버링 전력을 따라간다.
	private int id;

	@Column(nullable = false, length = 30)
	private String username;

	@Column(nullable = false, length = 100)
	private String password;

	@Column(nullable = false, length = 50)
	private String email;
	
	@Enumerated(EnumType.STRING) // enum을 DB에서 인식할 타입 지정
	private RoleType role; // 권한부여
	
	@CreationTimestamp // 시간이 자동으로 입력
	private Timestamp createDate;
}
