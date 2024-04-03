package com.CosmosMongoApp.controller;

import com.CosmosMongoApp.repo.UserRepo;
import com.CosmosMongoApp.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping("/user")
    public UserModel user(@RequestBody UserModel model){
        model.setId(UUID.randomUUID().toString());
        return  userRepo.save(model);

    }
    @GetMapping("/userInfo")
    public List<UserModel> getUsers(){
        return userRepo.findAll();
    }

}
