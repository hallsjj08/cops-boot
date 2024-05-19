package com.example.copsboot.user.web;

import java.util.UUID;

import com.example.copsboot.user.User;

public record UserDto(UUID userId, String email, UUID authServerId, String mobileToken) {
    public static UserDto fromUser(User user) {
        return new UserDto(user.getId().getId(), user.getEmail().value(), user.getAuthServerId().value(), user.getMobileToken().value());
    }
}
