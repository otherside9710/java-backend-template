package com.otherside.backend_template.context.users.infrastructure.persistence.mongo.repositories;

import lombok.RequiredArgsConstructor;
import com.otherside.backend_template.context.users.infrastructure.persistence.mongo.entities.UserEntity;
import com.otherside.backend_template.context.users.infrastructure.persistence.mongo.mappers.UserMapper;
import com.otherside.backend_template.context.users.domain.classes.User;
import com.otherside.backend_template.context.users.domain.contracts.IUserRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRepositoryMongo implements IUserRepository {

    private final ISpringDataMongoUserRepository repository;

    @Override
    public User save(User user) {
        UserEntity entity = UserMapper.toEntity(user);
        UserEntity savedEntity = repository.save(entity);
        return UserMapper.toDomain(savedEntity);
    }
}

interface ISpringDataMongoUserRepository extends MongoRepository<UserEntity, String> {}