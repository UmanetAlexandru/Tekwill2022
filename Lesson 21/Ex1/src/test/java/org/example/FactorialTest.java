package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactorialTest {
    private final Factorial factorial = new Factorial();

    @Test
    void testNegativeCase() {
        Assertions.assertEquals(-1, factorial.get(-1));
    }

    @Test
    void testGetCase0() {
        Assertions.assertEquals(1, factorial.get(0));
    }

    @Test
    void testGetCase1() {
        Assertions.assertEquals(1, factorial.get(1));
    }

    @Test
    void testGetCase2() {
        Assertions.assertEquals(2, factorial.get(2));
    }

    @Test
    void testGetCase5() {
        Assertions.assertEquals(120, factorial.get(5));
    }
}