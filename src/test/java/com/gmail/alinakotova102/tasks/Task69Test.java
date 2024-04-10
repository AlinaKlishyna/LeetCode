package com.gmail.alinakotova102.tasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task69Test {
    Task69 test;

    @BeforeEach
    void setUp() {
        test = new Task69();
    }

    @Test
    void mySqrt01() {
        int actual = test.mySqrt(4);

        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void mySqrt02() {
        int actual = test.mySqrt(8);

        int expected = 2;

        assertEquals(expected, actual);
    }
}