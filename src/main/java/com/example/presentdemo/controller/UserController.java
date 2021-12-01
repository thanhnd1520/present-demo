package com.example.presentdemo.controller;

import com.example.presentdemo.entity.User;
import com.example.presentdemo.response.ListUserResponse;
import com.example.presentdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    @Qualifier("new")
    UserService service;

    @RequestMapping(value = "/list")
    public ListUserResponse getAllUser(){
        List<User> listUser = service.getAllUser();
        ListUserResponse response = ListUserResponse.builder()
                .listUser(listUser)
                .build();
        return response;
    }


}
