package com.example.copsboot.user;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import com.example.orm.jpa.InMemoryUniqueIdGenerator;
import com.example.orm.jpa.UniqueIdGenerator;

@DataJpaTest
public class UserRepositoryTest {

    @TestConfiguration
    static class TestConfig {
        @Bean
        public UniqueIdGenerator<UUID> generator() {
            return new InMemoryUniqueIdGenerator();
        }
    }
    
    @Autowired
    private UserRepository repository;

    @Test
    public void testStoreUser() {
        User user = repository.save((new User(repository.nextId(),
                                        new Email("john.doe@test.com"),
                                        new AuthServerId(UUID.randomUUID()),
                                        new MobileToken("bananananas")
                                        )));

        assertNotNull(user);
        assertEquals(repository.count(), 1L);
    }
}
