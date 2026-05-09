package com.example.blog.controller;

import com.example.blog.dto.request.UpdateProfileRequest;
import com.example.blog.dto.response.ProfileResponse;

import com.example.blog.service.ProfileService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profiles")
public class ProfileController {

    private final ProfileService profileService;

    public ProfileController(
            ProfileService profileService
    ) {
        this.profileService = profileService;
    }

    @PutMapping("/{userId}")
    public ProfileResponse updateProfile(
            @PathVariable Integer userId,

            @RequestBody UpdateProfileRequest request
    ) {

        return profileService.updateProfile(
                userId,
                request
        );
    }
}
