package com.otherside.backend_template.context.users.infrastructure.persistence.mongo.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@Document(collection = "users")
public class UserEntity {
    @Id
    private String id;
    private String name;
    private String lastName;
    private String email;
    private String phone;

    public UserEntity() {
        this.id = UUID.randomUUID().toString();
    }
}
