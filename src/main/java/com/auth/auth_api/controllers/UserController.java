package com.auth.auth_api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth.auth_api.dtos.UserResponseDto;
import com.auth.auth_api.models.UserModel;

@RestController
@RequestMapping("/users")
public class UserController {

   @GetMapping("/me")
    public ResponseEntity<UserResponseDto> getMe() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserModel user = (UserModel) authentication.getPrincipal();
        return ResponseEntity.ok(new UserResponseDto(user.getId(), user.getName(), user.getEmail(), user.getRole()));
    }
    
}