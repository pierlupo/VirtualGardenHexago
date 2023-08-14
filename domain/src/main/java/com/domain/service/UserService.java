package com.domain.service;

import com.domain.model.User;

import java.util.Optional;

public interface UserService {

    User saveUser(String username, String password);
    User findByUsername(String username);
    User findById(int id);
    User getUserByUserName(String username);
}
