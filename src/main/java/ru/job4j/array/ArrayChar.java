package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
            for (int j = 0; j < pref.length; j++) {
                if (word[j] != pref[j]) {
                    return false;
                }
            }
        return true;
    }
}
