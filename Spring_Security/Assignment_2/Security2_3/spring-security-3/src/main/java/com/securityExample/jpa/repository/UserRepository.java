package com.securityExample.jpa.repository;

import com.securityExample.jpa.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>{
    User findByusername(String username);
}
