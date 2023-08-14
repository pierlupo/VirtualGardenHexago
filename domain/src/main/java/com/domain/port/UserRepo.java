package com.domain.port;

import com.domain.model.User;

import java.util.Optional;

public interface UserRepo {

    User save(User user);
    User findByUsername(String username);
    User findById(int id);
}
