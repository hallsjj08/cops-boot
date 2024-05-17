package com.example.orm.jpa;

@SuppressWarnings("rawtypes")
public interface Entity<T extends EntityId> {
    T getId();
}
