package com.epam.mentoringprogramm.calculator;

public class Calculator {

    public static long sum(long a, long b) {
        return a + b;
    }

    public static long sub(long a, long b) {
        return a - b;
    }

    public static long mult(long a, long b) {
        return a * b;
    }

    public static long div(long a, long b) {
        return a / b;
    }

    public static boolean isPositive(long value) {
        return value > 0;
    }

    public static boolean isNegative(long value) {
        return value < 0;
    }
}
