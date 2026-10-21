package com.ticketflow.dtos.userDto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RegisterRequest(
        @NotBlank(message = "Name Cannot Be Empty") String name,
        @NotBlank @Email(message = "Invalid Email Format") String email,
        @NotBlank @Size(min = 8, message = "Password must be At least 8 Character") String password
) {
}
