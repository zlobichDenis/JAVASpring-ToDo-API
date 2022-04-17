package com.example.todo.service;

import com.example.todo.entity.UserEntity;
import com.example.todo.exception.UserAlreadyExist;
import com.example.todo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public UserEntity registration(UserEntity user) throws UserAlreadyExist {
        if (userRepo.findUserEntityByUsername(user.getUsername()) != null) {
            throw new UserAlreadyExist("User already exist");
        }
        return userRepo.save(user);
    }
}
