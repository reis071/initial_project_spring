package com.example.project_spring.repositories;


import com.example.project_spring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositories extends JpaRepository<Product, Long> {
}
