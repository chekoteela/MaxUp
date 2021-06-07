package com.sharkit.maxup.controllers;

import com.sharkit.maxup.entity.UsersEntity;
import com.sharkit.maxup.exception.EmailOrPasswordAreInvalid;
import com.sharkit.maxup.exception.UserWithThisEmailMissing;
import com.sharkit.maxup.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    UsersService service;

    @PostMapping
    public ResponseEntity login(@RequestBody UsersEntity user){
        try{
            service.login(user);
            return ResponseEntity.ok("ok");
        }catch (EmailOrPasswordAreInvalid e){
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
