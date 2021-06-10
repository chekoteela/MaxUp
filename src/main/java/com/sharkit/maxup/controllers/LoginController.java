package com.sharkit.maxup.controllers;

import com.sharkit.maxup.entity.UsersEntity;
import com.sharkit.maxup.exception.EmailOrPasswordAreInvalid;
import com.sharkit.maxup.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    UsersService service;

    @PostMapping
    public ResponseEntity login(@RequestBody UsersEntity user){
        Map<String,String> map = new HashMap<>();
        try{
            map.put("response", "OK");
            service.login(user);
            return ResponseEntity.ok(map);
        }catch (EmailOrPasswordAreInvalid e){
            map.put("response", "Email or password are invalid");
            return ResponseEntity.badRequest().body(map);
        } catch (Exception e){
            map.put("response", "fail");
            return ResponseEntity.badRequest().body(map);
        }
    }
}
