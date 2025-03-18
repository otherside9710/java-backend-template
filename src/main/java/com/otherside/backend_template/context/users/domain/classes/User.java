package com.otherside.backend_template.context.users.domain.classes;

import lombok.Data;

@Data
public class User {
    private String id;
    private String name;
    private String lastName;
    private String email;
    private String phone;
}
