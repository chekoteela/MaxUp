package com.sharkit.maxup.controllers;

import com.sharkit.maxup.services.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/response")
public class ResponseController {

    @Autowired
    private ResponseService service;

    @PostMapping
    public ResponseEntity response(@RequestBody com.sharkit.maxup.entity.ResponseEntity responseEntity,
                                   @RequestParam Long userId){
        Map<String, String> map = new HashMap<>();
        try {
            map.put("response", "OK");
            service.createResponse(responseEntity,userId);
            return ResponseEntity.ok(map);
        }catch (Exception e){
            map.put("response", "fail");
            return ResponseEntity.badRequest().body(map);
        }
    }
}
