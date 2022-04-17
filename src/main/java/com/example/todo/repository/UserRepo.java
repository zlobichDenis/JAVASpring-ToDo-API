package com.example.todo.repository;

import com.example.todo.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserEntity, Long> {
    UserEntity findUserEntityByUsername(String username);
}
