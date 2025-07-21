package com.shop;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class ProductRepositoryTest {

    @Test
    void contextLoads() {
        // Just testing if the context loads
        assertThat(true).isTrue();
    }
}
