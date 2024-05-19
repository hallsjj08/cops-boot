package com.example.copsboot.user;

import org.springframework.util.Assert;

public record MobileToken(String value) {
    public MobileToken {
        Assert.notNull(value, "\"The MobileToken value should not be null\"");
    }
}
