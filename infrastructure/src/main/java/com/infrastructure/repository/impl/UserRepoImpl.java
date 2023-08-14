package com.infrastructure.repository.impl;

import com.domain.model.User;
import com.domain.port.UserRepo;
import com.infrastructure.entity.UserEntity;
import com.infrastructure.exception.NotFoundException;
import com.infrastructure.repository.UserEntityRepo;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRepoImpl implements UserRepo {

    private final UserEntityRepo userEntityRepo;

    private final ModelMapper modelMapper;

    public UserRepoImpl(UserEntityRepo userEntityRepo, ModelMapper modelMapper) {
        this.userEntityRepo = userEntityRepo;
        this.modelMapper = modelMapper;
    }

    @Override
    public User save(User user) {
        UserEntity userEntity = modelMapper.map(user, UserEntity.class);
        return modelMapper.map(userEntityRepo.save(userEntity), User.class);
    }

    @Override
    public User findByUsername(String username) {
        return modelMapper.map(userEntityRepo.findByUsername(username), User.class);
    }

    @Override
    public User findById(int id) {

        Optional<UserEntity> optionalUserEntity = userEntityRepo.findById(id);
        if(optionalUserEntity.isPresent()){
            return modelMapper.map(optionalUserEntity.get(), User.class);
        }
        throw new NotFoundException();
    }
}
