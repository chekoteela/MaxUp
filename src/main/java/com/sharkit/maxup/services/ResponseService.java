package com.sharkit.maxup.services;

import com.sharkit.maxup.entity.ResponseEntity;
import com.sharkit.maxup.entity.UsersEntity;
import com.sharkit.maxup.repository.ResponseRepository;
import com.sharkit.maxup.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ResponseService {
    @Autowired
    private ResponseRepository repository;
    @Autowired
    private UsersRepository usersRepository;

    public ResponseEntity createResponse(ResponseEntity responseEntity, Long userId){
       UsersEntity user = usersRepository.findById(userId).get();
        responseEntity.setUserE(user);
        responseEntity.setTime(LocalDate.now());
        return repository.save(responseEntity);
    }

}
