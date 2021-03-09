package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@Entity
public class Tweet {
	
	
	/**
	 * id
	 * データを一意に識別する
	 */
	@Id
	@GeneratedValue
	private Long id;
	
	/**
	 * author
	 * 投稿者
	 */
	@NotBlank
	private String author;
	
	/**
	 * tweetContent
	 * 投稿内容
	 */
	@Size(max=200)
	private String tweetContent;
	
	/**
	 * feeling
	 * 気持ち
	 */
	private String feeling;
	
	

}
