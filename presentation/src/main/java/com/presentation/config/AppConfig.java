package com.presentation.config;

import com.domain.model.User;
import com.domain.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

@Configuration
public class AppConfig {

    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }

//    @Bean
//    public UserService getUserService() {
//        return new UserService() {
//            @Override
//            public User saveUser(String username, String password) {
//                return null;
//            }
//
//            @Override
//            public User findByUsername(String username) {
//                return null;
//            }
//
//            @Override
//            public User findById(int id) {
//                return null;
//            }
//        };
//    }
}
