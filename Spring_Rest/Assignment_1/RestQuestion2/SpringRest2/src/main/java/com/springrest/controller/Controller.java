package com.springrest.controller;

import java.util.List;

import com.springrest.Authentication.UserService;
import com.springrest.UserDetails.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private UserService us;

    @GetMapping("/")
	public String getMethodName() {
		return "Hello!!";
	}

    @GetMapping("/allUsers")
    public List<User> getAllUser(){
        return this.us.getAllUser();
    }

    @GetMapping("/authenticate")
    public String getcheck(@RequestBody User user){
        return this.us.getcheck(user);
    }
    
}