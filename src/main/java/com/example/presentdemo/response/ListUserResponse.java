package com.example.presentdemo.response;


import com.example.presentdemo.entity.User;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
public class ListUserResponse {
    List<User> listUser;
}
