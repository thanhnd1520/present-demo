package com.example.presentdemo.serviceImp;


import com.example.presentdemo.entity.User;
import com.example.presentdemo.repository.UserRepository;
import com.example.presentdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service("old")
public class UserServiceImp implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public Optional<User> getUserById(String id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User insertUser(User user) {
        user.setId(UUID.randomUUID().toString());
        return userRepository.save(user);
    }

    @Override
    public List<User> filterByName(String name) {
        List<User> listUser = userRepository.findByUsernameContaining(name);
        return listUser;
    }

    @Override
    public Optional<User> updateUser(String id, User user) {
        Optional<User> entity = userRepository.findById(id);
        if(entity.isPresent()){
            return  entity;
        }else{
            user.setId(id);
            User userInsert = userRepository.save(user);
            return Optional.of(userInsert);
        }
    }


}
