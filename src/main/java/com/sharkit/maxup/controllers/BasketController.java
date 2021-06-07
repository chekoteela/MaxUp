package com.sharkit.maxup.controllers;

import com.sharkit.maxup.entity.BasketEntity;
import com.sharkit.maxup.services.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/basket")
public class BasketController {

    @Autowired
    private BasketService basketService;

    @PostMapping
    public ResponseEntity setProduce (@RequestBody BasketEntity basketEntity,
                                      @RequestParam Long userId){
        try {
            basketService.createProduce(basketEntity, userId);
            return ResponseEntity.ok("ok");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("fail");
        }

    }

    @DeleteMapping
    public ResponseEntity deleteProduce (@RequestParam Long id){
        try {
            basketService.deleteProduce(id);
            return ResponseEntity.ok("ok");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("fail");
        }

    }
}
