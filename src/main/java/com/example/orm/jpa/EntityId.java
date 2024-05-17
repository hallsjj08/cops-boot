package com.example.orm.jpa;

public interface EntityId<T> {
    T getId();

    String asString();
}
