package com.example.project_spring.resources;

import com.example.project_spring.entities.Order;
import com.example.project_spring.entities.OrderItem;
import com.example.project_spring.services.OrderItemService;
import com.example.project_spring.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/ordersItem")
public class OrderItemResource {

    @Autowired
    private OrderItemService service;

    @GetMapping
    public ResponseEntity<List<OrderItem>> responseOrderItem(){
        List<OrderItem> listOrderItem = service.findAll();
        return ResponseEntity.ok().body(listOrderItem);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<OrderItem> findById(@PathVariable Long id){
        OrderItem obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
