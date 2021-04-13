package com.question7.Entity;

public class User {
	
	private int userId;
	private String userName, userContact;
	
	public User() {
	}

	public User(int userId, String userName, String userContact) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userContact = userContact;
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

	public String getUserContact() {
		return userContact;
	}

	public void setUserContact(String userContact) {
		this.userContact = userContact;
	}
	
}
