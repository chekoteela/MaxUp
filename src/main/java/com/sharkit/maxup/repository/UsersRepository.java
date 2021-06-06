package com.sharkit.maxup.repository;

import com.sharkit.maxup.entity.UsersEntity;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<UsersEntity, Long> {
    UsersEntity findByEmail(String email);
}
