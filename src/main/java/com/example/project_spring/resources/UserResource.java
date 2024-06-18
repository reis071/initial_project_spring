package com.example.project_spring.resources;

import com.example.project_spring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> responseUser(){
        User user = new User(1L,"reis071","reis@gmail.com","1234");
        return ResponseEntity.ok().body(user);
    }
}
