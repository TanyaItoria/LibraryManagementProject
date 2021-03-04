package com.example.Library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {
    Array obj = new Array();
    ArrayList<Integer> emp = new ArrayList<>();

    @BeforeEach
    void setUp() {

        emp.add(1);
        emp.add(2);
        emp.add(3);
    }

    @Test
    void negativeTestCase() {
        String actualValue = obj.getValue(emp, -1);
        String expectedValue = "Negative Index dont exist";
        assertEquals(actualValue, expectedValue);
    }

    @Test
    void IndexOutOfRange() {
        String actualValue = obj.getValue(emp, 5);
        String expectedValue = "Array index out of bound";
        assertEquals(actualValue, expectedValue);
    }

    @Test
    void reachableIndex() {
        String actualValue = obj.getValue(emp, 2);
        String expectedValue = "Value at index 2 is 3";
        assertEquals(actualValue, expectedValue);
    }
}