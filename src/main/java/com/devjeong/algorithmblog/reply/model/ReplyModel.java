package com.devjeong.algorithmblog.reply.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;

import com.devjeong.algorithmblog.board.model.BoardModel;
import com.devjeong.algorithmblog.home.model.UserModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ReplyModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false, length = 200)
	private String content;

	@ManyToOne
	@JoinColumn(name = "boardId")
	private BoardModel boardModel;

	@ManyToOne
	@JoinColumn(name = "userId")
	private UserModel userModel;

	@CreationTimestamp
	private Timestamp createDate;
}
