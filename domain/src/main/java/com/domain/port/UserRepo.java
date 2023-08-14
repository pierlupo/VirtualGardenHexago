package com.domain.port;

import com.domain.model.User;

import java.util.Optional;

public interface UserRepo {

    User save(User user);
    Optional<User> findByUsername(String username);
    Optional<User> findById(int id);
}
