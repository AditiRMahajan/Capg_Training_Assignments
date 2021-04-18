package com.springsecurityjpa.securityjpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springsecurityjpa.securityjpa.Model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUsername(String username);

}
