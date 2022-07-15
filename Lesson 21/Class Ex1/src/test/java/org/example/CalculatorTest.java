package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    public static final Calculator calculator;

    @BeforeAll
    public static void beforeAll() {
        calculator = new Calculator();
    }

    @Test
    void testAdd() {
        int a = 2;
        int b = 3;
        int expected = a + b;

        int result = calculator.add(a, b);

        assertEquals(expected, result);
    }

    @Test
    void testSubtract() {
        int a = 4;
        int b = 2;
        int expected = a - b;

        int result = calculator.subtract(a, b);

        assertEquals(expected, result);
    }

    @Test
    void testMultiply() {
        int a = 2;
        int b = 3;
        int expected = a * b;

        int result = calculator.multiply(a, b);

        assertEquals(expected, result);
    }
}