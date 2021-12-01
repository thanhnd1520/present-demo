package com.example.presentdemo.serviceImp;

import com.example.presentdemo.entity.User;
import com.example.presentdemo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("new")
public class NewUserServiceImp implements UserService {

    @Override
    public Optional<User> getUserById(String id) {
        return Optional.empty();
    }

    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public User insertUser(User user) {
        return null;
    }

    @Override
    public List<User> filterByName(String name) {
        return null;
    }

    @Override
    public Optional<User> updateUser(String id, User user) {
        return Optional.empty();
    }
}
