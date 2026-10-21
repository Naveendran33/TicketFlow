package com.ticketflow.dtos.userDto;

import com.ticketflow.entity.Role;

public record RegisterResponse(
        Long id , String name, String email, Role role
) {
}
