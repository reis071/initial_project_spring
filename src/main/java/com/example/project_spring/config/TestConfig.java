package com.example.project_spring.config;

import com.example.project_spring.entities.Order;
import com.example.project_spring.entities.User;
import com.example.project_spring.enums.OrderStatus;
import com.example.project_spring.repositories.OrderRepositories;
import com.example.project_spring.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    UserRepositories userRepositories;

    @Autowired
    OrderRepositories orderRepositories;

    @Override
    public void run(String... args) throws Exception {
        User firstUser = new User(null, "reis","reis071@gmail.com","1234");
        User secondUser = new User(null, "correia","correia071@gmail.com","1234");

        Order firtstOrder = new Order(null, Instant.parse("2024-06-24T21:40:08Z"),OrderStatus.AWAITING_PAYMENT,firstUser);
        Order secondOrder = new Order(null, Instant.parse("2024-06-24T21:40:08Z"), OrderStatus.PAID,secondUser);
        userRepositories.saveAll( Arrays.asList(firstUser,secondUser) );
        orderRepositories.saveAll( Arrays.asList(firtstOrder,secondOrder) );
    }
}
