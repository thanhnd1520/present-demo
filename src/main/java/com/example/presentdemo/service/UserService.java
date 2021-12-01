package com.example.presentdemo.service;

import com.example.presentdemo.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> getUserById(String id);
    List<User> getAllUser();
    User insertUser(User user);
    List<User> filterByName(String name);
    Optional<User> updateUser(String id, User user);
}
