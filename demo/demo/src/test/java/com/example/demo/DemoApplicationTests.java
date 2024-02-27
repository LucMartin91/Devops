package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testAdd() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    void testMulti() {
        assertEquals(6, Calculator.multi(2, 3));
    }

    @Test
    void testDiv() {
        assertEquals(2, Calculator.div(6, 3));
    }
}
