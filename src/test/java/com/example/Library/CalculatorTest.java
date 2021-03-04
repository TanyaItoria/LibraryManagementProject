package com.example.Library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(calculator.add(2, 3), 5);
        assertEquals(calculator.add(-2, -3), -5);
        assertEquals(calculator.add(-2, 3), 1);
        assertEquals(calculator.add(2, -3), -1);
    }

    @Test
    void subtract() {
        assertEquals(calculator.subtract(2, 3), -1);
        assertEquals(calculator.subtract(-2, -3), 1);
        assertEquals(calculator.subtract(-2, 3), -5);
        assertEquals(calculator.subtract(2, -3), 5);
        assertEquals(calculator.subtract(-2, -0), -2);
    }

    @Test
    void multiply() {
        assertEquals(calculator.multiply(-2, -0), 0);
        assertEquals(calculator.multiply(-2, 0), 0);
        assertEquals(calculator.multiply(2, 3), 6);
        assertEquals(calculator.multiply(-2, -3), 6);
        assertEquals(calculator.multiply(-2, 3), -6);
        assertEquals(calculator.multiply(2, -3), -6);
    }

    @Test
    void divide() {
        assertEquals(calculator.divide(6, 3), 2);
        assertEquals(calculator.divide(6, 7), 0);
        assertEquals(calculator.divide(0, 3), 0);
        assertEquals(calculator.divide(-1, 3), 0);
        assertEquals(calculator.divide(-6, -3), 2);
        assertEquals(calculator.divide(-6, 3), -2);
        assertEquals(calculator.divide(6, -3), -2);
        assertEquals(calculator.divide(6, 0), Integer.MAX_VALUE);
    }
}