package com.example.project_spring.services;

import com.example.project_spring.entities.Category;
import com.example.project_spring.entities.Product;
import com.example.project_spring.repositories.CategoryRepositories;
import com.example.project_spring.repositories.ProductRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepositories productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();
    }
}

