package com.sharkit.maxup.controllers;

import com.sharkit.maxup.entity.UsersEntity;
import com.sharkit.maxup.exception.UserAlreadyExist;
import com.sharkit.maxup.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    UsersService service;

    @PostMapping
    public ResponseEntity registration(@RequestBody UsersEntity usersEntity){
        Map<String,String> map = new HashMap<>();
        try {
            map.put("response", "OK");
            service.registerUser(usersEntity);
            return ResponseEntity.ok(map);
        }catch (UserAlreadyExist e){
            map.put("response", "user already exist");
            return ResponseEntity.badRequest().body(map);

        }catch (Exception e){
            map.put("response", "fail");
            return ResponseEntity.badRequest().body(map);
        }
    }
}
