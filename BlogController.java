package com.example.blog.controller;

import com.example.blog.dto.request.CreateBlogRequest;
import com.example.blog.dto.response.BlogResponse;

import com.example.blog.service.BlogService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogs")
public class BlogController {

    private final BlogService blogService;

    public BlogController(
            BlogService blogService
    ) {
        this.blogService = blogService;
    }

    @PostMapping("/{userId}")
    public BlogResponse createBlog(
            @PathVariable Integer userId,

            @RequestBody CreateBlogRequest request
    ) {

        return blogService.createBlog(
                userId,
                request
        );
    }

    @GetMapping
    public List<BlogResponse> getAllBlogs() {

        return blogService.getAllBlogs();
    }

    @GetMapping("/search")
    public List<BlogResponse> searchBlogs(
            @RequestParam String keyword
    ) {

        return blogService.searchBlogs(keyword);
    }
}
