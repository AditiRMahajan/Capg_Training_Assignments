package com.springsecurityjpa.securityjpa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springsecurityjpa.securityjpa.Model.User;
import com.springsecurityjpa.securityjpa.Repository.UserRepository;

@RestController
public class AdminController {

	@Autowired
	private UserRepository userRepository;

    @GetMapping("/")
    public String run(){
        return "Home page";
    }

    @GetMapping("/user")
    public String user(){
        return "<h1>Welcome User</h1>";
    }

    @GetMapping("/admin")
    public String admin(){
        return "<h1>Welcome Admin</h1>";
    }

    @PostMapping("/")
    public String addUser(@RequestBody User user){
        this.userRepository.save(user);
        return "User added Successfully!";
    }
}
