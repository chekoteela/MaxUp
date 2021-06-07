package com.sharkit.maxup.controllers;

import com.sharkit.maxup.entity.UsersEntity;
import com.sharkit.maxup.exception.UserAlreadyExist;
import com.sharkit.maxup.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    UsersService service;

    @PostMapping
    public ResponseEntity registration(@RequestBody UsersEntity usersEntity){
        try {
            service.registerUser(usersEntity);
            return ResponseEntity.ok("a");
        }catch (UserAlreadyExist e){
            return ResponseEntity.badRequest().body("a");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("fail");
        }
    }
}
