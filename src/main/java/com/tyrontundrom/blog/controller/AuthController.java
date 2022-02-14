package com.tyrontundrom.blog.controller;

import com.tyrontundrom.blog.dto.RegisterRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
class AuthController {

    public void signUp(RegisterRequest registerRequest) {}

}
