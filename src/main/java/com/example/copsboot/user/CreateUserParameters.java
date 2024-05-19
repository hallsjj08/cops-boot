package com.example.copsboot.user;

public record CreateUserParameters(AuthServerId authServerId, Email email, MobileToken mobileToken) {
    
}
