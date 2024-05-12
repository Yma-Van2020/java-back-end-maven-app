package com.example.demo.dao;

import com.example.demo.entity.Excursion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*", allowedHeaders = "*")
public interface ExcursionRepository extends JpaRepository<Excursion, Long> {
    // Add any custom query methods if needed
}