package com.ticketflow.mapper;

import com.ticketflow.dtos.userDto.RegisterResponse;
import com.ticketflow.entity.User;

public class UserMapper {
    private UserMapper() {
        /* This utility class should not be instantiated */
    }


    public static RegisterResponse userToResponse(User user){
        return new RegisterResponse(user.getId(),user.getName(),user.getEmail(),user.getRole());
    }
}
