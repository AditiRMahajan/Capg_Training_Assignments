package com.example.springsecurityjdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SuppressWarnings("deprecation")
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	 @Override
	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	        auth.inMemoryAuthentication()
	               .withUser("user")
	               .password("userpass")
	               .roles("USER")
	               .and()
	               .withUser("admin")
	               .password("adminpass")
	               .roles("ADMIN");
	    }
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		        .antMatchers("/admin").hasRole("ADMIN")
		        .antMatchers("/user").hasAnyRole("ADMIN", "USER")
		        .antMatchers("/").permitAll()
		        .and().formLogin()
		        .and().rememberMe().key("rem-me-key")
			.rememberMeParameter("remember-me-param")
			.rememberMeCookieName("my-remember-me")
			.tokenValiditySeconds(86400);
	}
	
	 @Bean
	    public PasswordEncoder getPasswordEncoder(){
	        return NoOpPasswordEncoder.getInstance();
	    }

}
