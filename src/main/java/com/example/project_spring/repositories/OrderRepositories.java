package com.example.project_spring.repositories;

import com.example.project_spring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepositories extends JpaRepository<Order, Long> {
}
