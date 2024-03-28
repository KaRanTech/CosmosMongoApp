package com.CosmosMongoApp.controller;

import com.CosmosMongoApp.repo.UserRepo;
import com.CosmosMongoApp.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping("/user")
    public String user(@RequestBody UserModel model){
        userRepo.save(model);
        return "User Data Saved....!";
    }

}
