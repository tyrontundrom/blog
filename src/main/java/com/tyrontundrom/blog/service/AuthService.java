package com.tyrontundrom.blog.service;

import com.tyrontundrom.blog.dto.RegisterRequest;
import com.tyrontundrom.blog.model.User;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public void signUp(RegisterRequest registerRequest) {
        User user = new User();
        user.setUserName(registerRequest.getUserName());
        user.setPassword(registerRequest.getPassword());
        user.setEmail(registerRequest.getEmail());
    }
}
