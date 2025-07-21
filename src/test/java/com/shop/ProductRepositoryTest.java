package com.shop;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = ShopApplication.class)
public class ShopApplicationTests {

    @Test
    void contextLoads() {
        // Just test if Spring Application Context loads successfully
        assertThat(true).isTrue();
    }
}
