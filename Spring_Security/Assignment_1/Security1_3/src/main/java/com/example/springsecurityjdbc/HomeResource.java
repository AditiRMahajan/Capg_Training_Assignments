package com.example.springsecurityjdbc;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
	
	@GetMapping("/")
	public String home() {
		return ("<h1>Welcome</h1>");		
	}
	
	@GetMapping("/user")
	public String user() {
		return ("<h1>Welcome Users</h1>");		
	}
	
	@GetMapping("/admin")
	public String admin() {
		return ("<h1>Welcome Admin</h1>");		
	}
}
