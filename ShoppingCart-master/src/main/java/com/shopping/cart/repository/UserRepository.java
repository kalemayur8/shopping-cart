package com.shopping.cart.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shopping.cart.domain.User;


public interface UserRepository extends MongoRepository<User, String> {
}
