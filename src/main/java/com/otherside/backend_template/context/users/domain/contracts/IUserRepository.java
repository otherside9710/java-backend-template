package com.otherside.backend_template.context.users.domain.contracts;
import com.otherside.backend_template.context.users.domain.classes.User;

public interface IUserRepository {
    User save(User user);
}