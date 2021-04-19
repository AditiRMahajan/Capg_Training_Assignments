package com.securityExample.jpa.Controllers;

import com.securityExample.jpa.Models.User;
import com.securityExample.jpa.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder; 
    
    @GetMapping("/")
    public String run(){
        return "Home page";
    }

    @GetMapping("/user")
    public String user(){
        return "Welcome Users!";
    }

    @GetMapping("/admin")
    public String admin(){
        return "Welcome Admin";
    }

    @PostMapping("/")
    public String addUser(@RequestBody User user){
        String pwd = user.getPassword();
        String encodepwd = passwordEncoder.encode(pwd);
        user.setPassword(encodepwd);
        this.userRepository.save(user);
        return "Successfully added";
    }
    
}
