package com.example.project_spring.services;

import com.example.project_spring.entities.Order;
import com.example.project_spring.entities.OrderItem;
import com.example.project_spring.repositories.OrderItemRepositories;
import com.example.project_spring.repositories.OrderRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderItemService {

    @Autowired
    private OrderItemRepositories orderItemrepository;

    public List<OrderItem> findAll() {
        return orderItemrepository.findAll();
    }
    public OrderItem findById(Long id) {
        Optional<OrderItem> obj = orderItemrepository.findById(id);
        return obj.get();
    }
}

