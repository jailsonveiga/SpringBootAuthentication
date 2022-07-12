package com.jay.springbootauthentication.service;

import com.jay.springbootauthentication.model.Role;
import com.jay.springbootauthentication.model.User;

import java.util.List;

public interface UserService {

    //method to save user and is going to return user
    User saveUser(User user);
    Role saveRole(Role role);

    //This method is not going to return anything
    void addRoleToUser(String username, String roleName);

    User getUser(String username);
    List<User>getUsers();
}
