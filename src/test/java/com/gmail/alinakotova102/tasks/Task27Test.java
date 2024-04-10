package com.gmail.alinakotova102.tasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task27Test {
    Task27 test;

    @BeforeEach
    void setUp() {
        test = new Task27();
    }

    @Test
    void removeElementCase01() {
        int[] actual = test.removeElement(new int[]{3, 2, 2, 3}, 3);

        int[] expected = {2, 2, 2, 3};

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeElementCase02() {
        int[] actual = test.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2);

        int[] expected = {0, 1, 3, 0, 4, 0, 4, 2};

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeElementCase03() {
        int[] actual = test.removeElement(new int[]{5, 4}, 5);

        int[] expected = {4, 4};

        assertArrayEquals(expected, actual);
    }
}