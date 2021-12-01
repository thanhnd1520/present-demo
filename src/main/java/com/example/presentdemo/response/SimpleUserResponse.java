package com.example.presentdemo.response;

import com.example.presentdemo.entity.User;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class SimpleUserResponse {
    User user;
}
