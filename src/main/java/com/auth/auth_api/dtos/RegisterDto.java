package com.auth.auth_api.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record RegisterDto(@NotBlank String name, @NotBlank @Email String email, @NotBlank String password, @NotBlank String role) {


    
}