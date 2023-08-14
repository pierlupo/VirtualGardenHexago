package com.domain.service;

import com.domain.model.User;

import java.util.Optional;

public interface UserService {

    User saveUser(String username, String password);
    Optional<User> findByUsername(String username);
    Optional<User> findById(int id);
}
