package com.shopping.cart.domain;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="user")
public class User{
    @Id
    private String id;

    private String name;
    private String email;

    @DBRef
    private Set<ShoppingCart> shoppingCarts = new HashSet<>();

    public User(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public User(){
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
