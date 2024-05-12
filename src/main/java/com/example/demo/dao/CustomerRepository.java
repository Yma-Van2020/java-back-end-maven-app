package com.example.demo.dao;

import com.example.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*", allowedHeaders = "*") // Enable Cross-Origin Resource Sharing (CORS) for all origins and headers
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Add any custom query methods if needed
}

