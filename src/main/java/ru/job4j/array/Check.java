package ru.job4j.array;

public class Check {

    public static boolean mono(boolean[] data) {
        boolean result = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] != result) {
                return false;
            }
        }
        return true;
    }
}
