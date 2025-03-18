package com.otherside.backend_template.context.users.infrastructure.persistence.mongo.mappers;

import com.otherside.backend_template.context.users.domain.classes.User;
import com.otherside.backend_template.context.users.infrastructure.persistence.mongo.entities.UserEntity;

public class UserMapper {

    public static UserEntity toEntity(User user) {
        UserEntity entity = new UserEntity();
        entity.setId(user.getId());
        entity.setName(user.getName());
        entity.setLastName(user.getLastName());
        entity.setEmail(user.getEmail());
        entity.setPhone(user.getPhone());
        return entity;
    }

    public static User toDomain(UserEntity entity) {
        User user = new User();
        user.setId(entity.getId());
        user.setName(entity.getName());
        user.setLastName(entity.getLastName());
        user.setEmail(entity.getEmail());
        user.setPhone(entity.getPhone());
        return user;
    }
}
