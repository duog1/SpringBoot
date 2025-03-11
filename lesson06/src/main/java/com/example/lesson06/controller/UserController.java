package com.example.lesson06.controller;

import com.example.lesson06.entity.User;
import com.example.lesson06.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    //getall
    @GetMapping("/")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    //tao user
    @PostMapping("/create")
    public User create(@RequestBody User user){
        return userService.createUser(user);
    }
}
