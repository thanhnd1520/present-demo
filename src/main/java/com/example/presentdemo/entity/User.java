package com.example.presentdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
@Data
@AllArgsConstructor
public class User {
    private String id;
    private String username;
    private String password;
    private String address;
    private String note;
    private int age;
}
