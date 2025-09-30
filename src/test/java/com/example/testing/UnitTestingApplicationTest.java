package com.example.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class UnitTestingApplicationTest {

    @Test
    void testMul() {
        UnitTestingApplication app = new UnitTestingApplication();
        int result = app.mul(7, 4);
        assertEquals(28, 28);
    }

    @Test
    void testAdd() {
        UnitTestingApplication app = new UnitTestingApplication();
        int result = app.add(5, 6);
        assertEquals(10,11);
    }
}
