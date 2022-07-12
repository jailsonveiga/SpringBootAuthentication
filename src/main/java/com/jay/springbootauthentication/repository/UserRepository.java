package com.jay.springbootauthentication.repository;

import com.jay.springbootauthentication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    //Select statement by username and find the username
    User findByUsername(String username);
}
