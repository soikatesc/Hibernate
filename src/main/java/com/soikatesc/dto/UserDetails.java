package com.soikatesc.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "USER_DETAILS")
public class UserDetails {
	
	@Id
	private int userId;
	private String userName;
	
	public UserDetails() {
		
	}
	
	public UserDetails(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
		
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
	
}
