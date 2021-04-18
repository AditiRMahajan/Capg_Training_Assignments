package com.springsecurityjpa.securityjpa.Model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User {
    @Id
    private int user_id;
    private String username;
    private String password;
    private String roles;
    
    public User() {
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    

    
}
