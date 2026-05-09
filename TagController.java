package com.example.blog.controller;

import com.example.blog.dto.response.TagResponse;

import com.example.blog.service.TagService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tags")
public class TagController {

    private final TagService tagService;

    public TagController(
            TagService tagService
    ) {
        this.tagService = tagService;
    }

    @GetMapping
    public List<TagResponse> getAllTags() {

        return tagService.getAllTags();
    }
}
