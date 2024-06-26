package com.example.project_spring.repositories;

import com.example.project_spring.entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepositories extends JpaRepository<Category, Long> {
}
