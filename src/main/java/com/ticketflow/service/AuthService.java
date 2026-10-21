package com.ticketflow.service;

import com.ticketflow.dtos.userDto.RegisterRequest;
import com.ticketflow.dtos.userDto.RegisterResponse;
import com.ticketflow.entity.User;
import com.ticketflow.exception.UserAlreadyExistException;
import com.ticketflow.mapper.UserMapper;
import com.ticketflow.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;


    public RegisterResponse register(RegisterRequest request){
        if(userRepository.existsByEmail(request.email())){
           throw new UserAlreadyExistException("User Already Exist.Try to Login..");
        }

        User user = new User();
        user.setName(request.name());
        user.setEmail(request.email());
        user.setPassword(passwordEncoder.encode(request.password()));

        return UserMapper.userToResponse(userRepository.save(user));
    }
}
