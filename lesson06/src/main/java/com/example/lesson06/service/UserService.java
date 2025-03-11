package com.example.lesson06.service;

import com.example.lesson06.entity.User;
import com.example.lesson06.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    //tao moi
    public User createUser(User user){
        return userRepository.save(user);
    }

    //lay all user
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    //cap nhat
    public User updateUser(User user){
        return userRepository.save(user);
    }
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}
