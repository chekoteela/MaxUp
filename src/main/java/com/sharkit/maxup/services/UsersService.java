package com.sharkit.maxup.services;

import com.sharkit.maxup.entity.UsersEntity;
import com.sharkit.maxup.exception.UserAlreadyExist;
import com.sharkit.maxup.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    UsersRepository repository;

    public UsersEntity registerUser(UsersEntity users) throws UserAlreadyExist {
        if (repository.findByEmail(users.getEmail()) != null){
            throw new UserAlreadyExist("User already exist");
        }
        return repository.save(users);
    }

}
