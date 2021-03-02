package com.example.Library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdderTest {
    @Test
    void testAddition() {
        Adder add = new Adder();
        assertEquals(add.add(3, 4), 7);
    }
}