package com.shopping.cart.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shopping.cart.domain.Product;


public interface ProductRepository extends MongoRepository<Product, String> {

}
