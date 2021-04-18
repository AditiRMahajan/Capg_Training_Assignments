package com.example.springsecurityldap;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
	
	@GetMapping("/")
	public String index() {
		return "Home Page";		
	}
	
/*	@GetMapping("/user")
	public String user() {
		return ("<h1>Welcome Users</h1>");		
	}
	
	@GetMapping("/admin")
	public String admin() {
		return ("<h1>Welcome Admin</h1>");		
	}*/
}