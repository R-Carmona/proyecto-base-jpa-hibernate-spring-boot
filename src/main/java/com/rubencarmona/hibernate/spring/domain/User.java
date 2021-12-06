package com.rubencarmona.hibernate.spring.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class User {

	@Id
	private int id;

	@Column
	private String userName;

	@Column
	private String userMessage;	

}