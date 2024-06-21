package com.example.project_spring.repositories;

import com.example.project_spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositories extends JpaRepository<User, Long> {
}
