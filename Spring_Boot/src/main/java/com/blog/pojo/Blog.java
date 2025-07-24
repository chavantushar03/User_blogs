package com.blog.pojo;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="blogs")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Blog extends BaseEntity{
	@Column(name="title")
	private String title;
	@Column(name="content")
	private String content;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id",nullable=false)
	private User user;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="catgeory_id",nullable=false)
	private Catgeory catgeory;
	

}
