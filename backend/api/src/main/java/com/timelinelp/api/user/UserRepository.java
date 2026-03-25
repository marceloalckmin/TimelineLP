package com.timelinelp.api.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, UUID>{
    User findByEmailAndPassword(String email, String password);
    User findByEmail(String email);
}
