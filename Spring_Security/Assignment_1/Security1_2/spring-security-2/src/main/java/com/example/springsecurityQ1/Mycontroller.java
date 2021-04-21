package com.example.springsecurityQ1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Mycontroller {
	
	
	@GetMapping(path="/login")
	public String login() {
		return "login";
	}
	
	

	@GetMapping(path="/index")
	public String  user() {
		return "index";
		
	}


	@GetMapping("/admin")
	public String  admin() {
		return("hello world admin!");
		
	}

}
