package com.sharkit.maxup.services;

import com.sharkit.maxup.entity.BasketEntity;
import com.sharkit.maxup.entity.UsersEntity;
import com.sharkit.maxup.repository.BasketRepository;
import com.sharkit.maxup.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasketService {

    @Autowired
    private BasketRepository basketRepository;
    @Autowired
    private UsersRepository repository;

    public BasketEntity createProduce(BasketEntity basketEntity, Long userId){
        UsersEntity user = repository.findById(userId).get();
        basketEntity.setUser(user);
        return basketRepository.save(basketEntity);
    }

    public BasketEntity deleteProduce( Long id){
        BasketEntity basketEntity = basketRepository.findById(id).get();
        basketRepository.delete(basketEntity);
        return basketEntity;
    }
}

