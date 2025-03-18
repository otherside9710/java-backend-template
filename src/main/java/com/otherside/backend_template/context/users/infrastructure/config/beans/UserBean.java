package com.otherside.backend_template.context.users.infrastructure.config.beans;

import com.otherside.backend_template.context.users.application.use_cases.create.CreateUser;
import com.otherside.backend_template.context.users.domain.contracts.IUserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserBean {

    @Bean
    public CreateUser createUserUseCase(IUserRepository userRepository) {
        return new CreateUser(userRepository);
    }
}
