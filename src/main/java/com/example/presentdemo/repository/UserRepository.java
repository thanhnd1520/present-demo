package com.example.presentdemo.repository;

import com.example.presentdemo.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
//    @Query("{'age' : {$exists: false}")
    List<User> findByUsernameContaining(String name);
//    @Query(value = "{'username' : {$in : ?name}")
//    List<User> getUserContaining(String name);
}
