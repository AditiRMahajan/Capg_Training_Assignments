package com.example.springsecurityQ1;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SuppressWarnings("deprecation")
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("root")
		.password("root")
		.roles("USER")
		.and()
		.withUser("foo")
		.password("foo")
		.roles("ADMIN");
	}

	@Bean
	public PasswordEncoder  getpasswordEncoder() {
		return NoOpPasswordEncoder.getInstance(); //not porividng any security.!
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
	
	http.authorizeRequests()
    .antMatchers("/**").permitAll()
    .anyRequest().authenticated()
    .and()
    .formLogin()
    .loginPage("/login")
    .loginProcessingUrl("/login")
    .defaultSuccessUrl("/index")
    .failureForwardUrl("/login").permitAll();
	
	
	
}
}
