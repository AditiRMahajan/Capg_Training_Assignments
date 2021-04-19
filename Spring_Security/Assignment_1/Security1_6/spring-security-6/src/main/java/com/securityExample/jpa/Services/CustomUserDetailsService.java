package com.securityExample.jpa.Services;

import com.securityExample.jpa.Models.User;
import com.securityExample.jpa.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByusername(username);
        CustomUserDetails userDetails = null;
		if (user != null) {
			userDetails = new CustomUserDetails(user);
		} else {
			throw new UsernameNotFoundException("User does not exist with the name : " + username);
		}
		return userDetails;
        
    }
    
}
