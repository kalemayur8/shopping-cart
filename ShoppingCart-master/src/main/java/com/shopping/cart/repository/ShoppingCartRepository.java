package com.shopping.cart.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shopping.cart.domain.ShoppingCart;


public interface ShoppingCartRepository extends MongoRepository<ShoppingCart, String> {
    List<ShoppingCart> findByStatus(String status);
}
