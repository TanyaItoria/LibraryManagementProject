package com.example.Library;

public class Calculator {
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int divide(int firstNumber, int secondNumber) {
        int c = Integer.MAX_VALUE;
        try {
            c = firstNumber / secondNumber;
        } catch (Exception e) {
            System.out.println("Can't divide by 0");
        }
        return c;
    }
}
