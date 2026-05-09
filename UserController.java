package com.example.blog.controller;

import com.example.blog.dto.request.CreateUserRequest;
import com.example.blog.dto.response.UserResponse;

import com.example.blog.service.UserService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(
            UserService userService
    ) {
        this.userService = userService;
    }

    @PostMapping
    public UserResponse createUser(
            @RequestBody CreateUserRequest request
    ) {

        return userService.createUser(request);
    }

    @GetMapping("/{userId}")
    public UserResponse getUser(
            @PathVariable Integer userId
    ) {

        return userService.getUser(userId);
    }
}
