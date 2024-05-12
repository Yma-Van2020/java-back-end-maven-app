package com.example.demo.dao;

import com.example.demo.entity.Vacation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*", allowedHeaders = "*")
public interface VacationRepository extends JpaRepository<Vacation, Long> {
    // Add any custom query methods if needed
}
