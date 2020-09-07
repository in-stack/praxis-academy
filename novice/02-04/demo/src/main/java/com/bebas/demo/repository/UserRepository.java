package com.bebas.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.bebas.demo.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    
}