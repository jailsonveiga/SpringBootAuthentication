package com.jay.springbootauthentication.repository;

import com.jay.springbootauthentication.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
