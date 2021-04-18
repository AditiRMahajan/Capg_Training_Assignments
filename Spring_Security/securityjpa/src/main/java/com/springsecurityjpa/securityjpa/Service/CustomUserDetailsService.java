package com.springsecurityjpa.securityjpa.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springsecurityjpa.securityjpa.Model.User;
import com.springsecurityjpa.securityjpa.Repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        CustomUserDetails userDetails = null;
		if (user != null) {
			userDetails = new CustomUserDetails(user);
		} else {
			throw new UsernameNotFoundException("User not exist with name : " + username);
		}
		return userDetails;
        
    }

}
