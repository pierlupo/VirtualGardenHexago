package com.application.service;

import com.domain.model.User;
import com.domain.port.PasswordAppEncoder;
import com.domain.port.UserRepo;
import com.domain.service.UserService;

import java.util.Optional;

public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;
    private  PasswordAppEncoder passwordEncoder;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public UserServiceImpl(UserRepo userRepo, PasswordAppEncoder passwordEncoder) {
        this.userRepo = userRepo;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User saveUser(String username, String password) {
        String encodedPassword = passwordEncoder.encode(password);
        User user = new User( username, encodedPassword);
        return userRepo.save(user);
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return userRepo.findByUsername(username);
    }

    @Override
    public Optional<User> findById(int id) {
        return userRepo.findById(id);    }
}
