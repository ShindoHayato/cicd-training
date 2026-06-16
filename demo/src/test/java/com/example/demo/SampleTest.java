package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SampleTest {
    @Test
    public void testSample() {
        int expected = 5;
        int actual = 2 + 3;
        assertEquals(expected, actual);
    }
}
