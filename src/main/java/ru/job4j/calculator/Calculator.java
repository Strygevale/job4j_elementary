package ru.job4j.calculator;

public class Calculator {

    public static void main(String[] args) {
        Calculator.plus(1, 3);
    }

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }
}
