package com.devjeong.algorithmblog.board.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import com.devjeong.algorithmblog.home.model.UserModel;
import com.devjeong.algorithmblog.reply.model.ReplyModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class BoardModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment
	private int id;

	@Column(nullable = false, length = 100)
	private String title;

	@Lob // 대용량 데이터
	private String content;

	@ColumnDefault("0")
	private int count; //조회수

	@ManyToOne // Many = Board, User = One (즉, 한명의 유저는 여러개의 보드를 쓸 수 있다.)
	@JoinColumn(name = "userId")
	private UserModel usermodel; // DB는 오브젝트를 저장할 수 없다. FK, 자바는 오브젝트를 저장할 수 있다.

	@OneToMany(mappedBy = "boardModel", fetch = FetchType.EAGER) //mappedBy 연관관계의 주인 X, 기본 전략은 FetchType.Lazy
	private List<ReplyModel> replyModel;

	@CreationTimestamp
	private Timestamp createData;
}
