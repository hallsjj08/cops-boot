package com.example.copsboot.user.web;

import java.util.UUID;

import org.springframework.security.oauth2.jwt.Jwt;

import com.example.copsboot.user.AuthServerId;
import com.example.copsboot.user.CreateUserParameters;
import com.example.copsboot.user.Email;
import com.example.copsboot.user.MobileToken;

public record CreateUserRequest(String mobileToken) {
    
    public CreateUserParameters toParemeters(Jwt jwt) {
        AuthServerId authServerId = new AuthServerId(UUID.fromString((jwt.getSubject())));

        String email = jwt.getClaimAsString("email");
        return new CreateUserParameters(authServerId, new Email(email), new MobileToken(mobileToken));
    }
}
