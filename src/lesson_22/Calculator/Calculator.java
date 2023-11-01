package lesson_22.Calculator;

public class Calculator {

    private static final double PI = 3.1415926;

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double circleArea(int radius) {
        // pi * (r * r)
        return PI * (radius * radius);
    }
}
