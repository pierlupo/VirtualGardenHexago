package com.infrastructure.repository.impl;

import com.domain.model.User;
import com.domain.port.UserRepo;
import com.infrastructure.entity.UserEntity;
import com.infrastructure.repository.UserEntityRepo;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRepoImpl implements UserRepo {

    private final UserEntityRepo userEntityRepo;

    public UserRepoImpl(UserEntityRepo userEntityRepo) {
        this.userEntityRepo = userEntityRepo;
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return Optional.empty();
    }

    @Override
    public Optional<User> findById(int id) {
        return Optional.empty();
    }
}
