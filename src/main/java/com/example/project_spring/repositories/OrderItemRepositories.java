package com.example.project_spring.repositories;

import com.example.project_spring.entities.Order;
import com.example.project_spring.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepositories extends JpaRepository<OrderItem, Long> {
}
