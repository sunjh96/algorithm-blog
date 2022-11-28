package com.devjeong.algorithmblog.home.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity // User 클래스가 MySQL에 테이블 자동 생성
public class UserModel {

	@Id //Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 프로젝트에서 연결된 DB의 넘버링 전략을 따라간다.
	private int id; //시퀀스, auto-increment

	@Column(nullable = false, length = 30)
	private String username; //아이디

	@Column(nullable = false, length = 100) //해쉬 (비밀번호 암호화)
	private String password;

	@Column(nullable = false, length = 50)
	private String email;

	@ColumnDefault("'user'")
	private String role; //Enum으로 변경 예정

	@CreationTimestamp // 시간이 자동 입력
	private Timestamp createDate;
}
