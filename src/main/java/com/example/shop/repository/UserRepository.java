package com.example.shop.repository;

import com.example.shop.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity , Integer> {


    Boolean existsByUsername(String username);

    UserEntity findByUsername(String username);
}
