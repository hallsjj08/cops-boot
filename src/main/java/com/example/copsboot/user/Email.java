package com.example.copsboot.user;

import org.springframework.util.Assert;

public record Email(String value) {
    public Email {
        Assert.notNull(value, "The Email value should not be null");
    }
}
