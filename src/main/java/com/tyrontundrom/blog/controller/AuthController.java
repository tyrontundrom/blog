package com.tyrontundrom.blog.controller;

import com.tyrontundrom.blog.dto.RegisterRequest;
import com.tyrontundrom.blog.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
class AuthController {

    private final AuthService authService;

    @PostMapping("/signup")
    public void signUp(@RequestBody RegisterRequest registerRequest) {
        authService.signUp(registerRequest);
    }

}
