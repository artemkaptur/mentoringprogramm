package com.epam.mentoringprogramm;

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
        if (value > 0)
            return true;
        return false;
    }

    public static boolean isNegative(long value) {
        if (value < 0)
            return true;
        return false;
    }

}
