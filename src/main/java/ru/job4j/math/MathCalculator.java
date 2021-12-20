package ru.job4j.math;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subAndDivision(double first, double second) {
        return subtraction(first, second)
                + division(first, second);
    }

    public static double sumAll(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + subtraction(first, second)
                + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("sumAndMultiply: " + sumAndMultiply(10, 20));
        System.out.println("subAndDivision: " + subAndDivision(40, 10));
        System.out.println("sumAll: " + sumAndMultiply(15, 20));
    }
}