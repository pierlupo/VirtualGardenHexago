package com.application.config;

import com.application.service.PlantServiceImpl;
import com.application.service.UserServiceImpl;
import com.infrastructure.repository.impl.PlantRepoImpl;
import com.infrastructure.repository.impl.UserRepoImpl;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class PresentationInitializer implements ApplicationContextInitializer {

    private final ConfigurableApplicationContext infraContext;
    public PresentationInitializer(ConfigurableApplicationContext infraContext) {
        this.infraContext = infraContext;
    }
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        ConfigurableListableBeanFactory registry = applicationContext.getBeanFactory();
        registry.registerSingleton("PlantService", new PlantServiceImpl(infraContext.getBean(PlantRepoImpl.class)));
        registry.registerSingleton("UserService", new UserServiceImpl(infraContext.getBean(UserRepoImpl.class)));
    }
}
