package com.otherside.backend_template.context.users.application.use_cases.create;
import com.otherside.backend_template.context.users.domain.classes.User;
import com.otherside.backend_template.context.users.domain.contracts.IUserRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateUser {

    private final IUserRepository repository;

    public User execute(User user) {
        return repository.save(user);
    }
}
