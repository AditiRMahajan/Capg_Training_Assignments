package com.springrest.Authentication;

import java.util.*;
import org.springframework.stereotype.Service;
import com.springrest.UserDetails.User;


@Service
public class UserServiceImpl implements UserService{

    List<User> list;

    public UserServiceImpl() {
        list = new ArrayList<User>();
        list.add(new User("Aditi","Aditi"));
        list.add(new User("Mahajan","Mahajan"));
    }
 

    public String getcheck(User user) {
        String str = "Invalid user";
        System.out.println(user.getUserName());
        for(User u:list){
            if(u.getUserName().equals(user.getUserName())){
                if(u.getPassword().equals(user.getPassword())){
                    str = "Valid user";
                    break;
                }
            }
        }
        return str;
    }
    
    
    public List<User> getAllUser() {
        return list;
    } 

}