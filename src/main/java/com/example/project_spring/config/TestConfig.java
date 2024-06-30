package com.example.project_spring.config;

import com.example.project_spring.entities.Category;
import com.example.project_spring.entities.Order;
import com.example.project_spring.entities.Product;
import com.example.project_spring.entities.User;
import com.example.project_spring.enums.OrderStatus;
import com.example.project_spring.repositories.CategoryRepositories;
import com.example.project_spring.repositories.OrderRepositories;
import com.example.project_spring.repositories.ProductRepositories;
import com.example.project_spring.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    UserRepositories userRepositories;

    @Autowired
    OrderRepositories orderRepositories;

    @Autowired
    CategoryRepositories categoryRepository;

    @Autowired
    ProductRepositories productRepository;

    @Override
    public void run(String... args) throws Exception {
        User firstUser = new User(null, "reis","reis071@gmail.com","1234");
        User secondUser = new User(null, "correia","correia071@gmail.com","1234");

        Order firtstOrder = new Order(null, Instant.parse("2024-06-24T21:40:08Z"),OrderStatus.AWAITING_PAYMENT,firstUser);
        Order secondOrder = new Order(null, Instant.parse("2024-06-24T21:40:08Z"), OrderStatus.PAID,secondUser);

        Product firstProduct = new Product(null,"iphone 15", "the best smartphone",1.500,   "");
        Product secondProduct = new Product(null,"lg smart tv", "the best smart tv",2.500, "");

        Category firstCategory = new Category("SmartTech",null );
        Category secondCategory = new Category("Food",null );
        categoryRepository.saveAll(Arrays.asList(firstCategory,secondCategory));
        productRepository.saveAll(Arrays.asList(firstProduct,secondProduct));

        firstProduct.getCategories().add(firstCategory);
        firstProduct.getCategories().add(secondCategory);
        secondProduct.getCategories().add(firstCategory);
        productRepository.saveAll(Arrays.asList(firstProduct,secondProduct));

        userRepositories.saveAll( Arrays.asList(firstUser,secondUser) );
        orderRepositories.saveAll( Arrays.asList(firtstOrder,secondOrder) );


    }

}
