package com.gmail.alinakotova102.tasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    Task1 test;

    @BeforeEach
    void setUp() {
        test = new Task1();
    }

    @Test
    @DisplayName("Simple values should work with the beginning")
    void case01() {
        int[] actual = test.twoSum(new int[]{2, 7, 11, 15}, 9);

        int[] expected = {0, 1};

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Simple values should work with the end")
    void case02() {
        int[] actual = test.twoSum(new int[]{3, 2, 4}, 6);

        int[] expected = {1, 2};

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Simple values with minimum array length")
    void case03() {
        int[] actual = test.twoSum(new int[]{3, 3}, 6);

        int[] expected = {0, 1};

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Zero values")
    void case04() {
        int[] actual = test.twoSum(new int[]{3, 2, 3}, 6);

        int[] expected = {0, 2};

        assertArrayEquals(expected, actual);
    }
}