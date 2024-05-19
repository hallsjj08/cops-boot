package com.example.copsboot.user;

import com.example.orm.jpa.AbstractEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "copsboot_user")
public class User extends AbstractEntity<UserId> {

    private Email email;
    private AuthServerId authServerId;
    private MobileToken mobileToken;

    protected User() {

    }

    public User(UserId id, Email email, AuthServerId authServerId, MobileToken mobileToken) {
        super(id);
        this.email = email;
        this.authServerId = authServerId;
        this.mobileToken = mobileToken;
    }

    public Email getEmail() {
        return email;
    }

    public AuthServerId getAuthServerId() {
        return authServerId;
    }

    public MobileToken getMobileToken() {
        return mobileToken;
    }
}
