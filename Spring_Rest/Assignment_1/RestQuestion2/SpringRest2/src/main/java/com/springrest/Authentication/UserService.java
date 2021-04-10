package com.springrest.Authentication;

import java.util.List;

import com.springrest.UserDetails.User;

public interface UserService {

    public String getcheck(User user);

    public List<User> getAllUser();
    
}