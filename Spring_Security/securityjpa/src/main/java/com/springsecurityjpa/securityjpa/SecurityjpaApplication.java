package com.springsecurityjpa.securityjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.securityExample.jpa.repository.UserRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SecurityjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityjpaApplication.class, args);
	}

}
