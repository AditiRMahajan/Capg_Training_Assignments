package com.springrest.UserDetails;

public class User {
    private String userName;
    private String password;

    public User(String username, String password) {
        this.userName = username;
        this.password = password;
    }
    
    public User() {
    }
    
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
    
  
}