package com.otherside.backend_template.context.users.infrastructure.services;

import com.otherside.backend_template.context.users.application.use_cases.create.CreateUser;
import com.otherside.backend_template.context.users.domain.classes.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final CreateUser createUserUseCase;

    public User createUser(User user) {
        return createUserUseCase.execute(user);
    }
}
