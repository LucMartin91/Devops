package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

    // Définition directe de la classe Calculator
    static class Calculator {
        public static int add(int a, int b) {
            return a + b;
        }

        public static int multi(int a, int b) {
            return a * b;
        }

        public static int div(int a, int b) {
            if (b != 0) {
                return a / b;
            } else {
                throw new ArithmeticException("Division by zero");
            }
        }
    }

    @Test
    void contextLoads() {
        // Test de la méthode contextLoads
    }

    @Test
    @Ignore
    public void testAdd() {
        assertEquals(6, Calculator.add(2, 3));
    }
    
    @Test
    void testMulti() {
        // Appeler directement la méthode multi de la classe Calculator définie ici
        assertEquals(6, Calculator.multi(2, 3));
    }

    @Test
    void testDiv() {
        // Appeler directement la méthode div de la classe Calculator définie ici
        assertEquals(2, Calculator.div(6, 3));
    }
}
