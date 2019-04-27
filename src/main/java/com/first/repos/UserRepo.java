package com.first.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

public interface UserRepo extends JpaRepository<User,Long> {
    com.first.domain.User findByUsername(String username);
}

