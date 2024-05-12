package com.example.demo.dao;

import com.example.demo.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*", allowedHeaders = "*")
public interface CartRepository extends JpaRepository<Cart, Long> {
    // Add any custom query methods if needed
}
