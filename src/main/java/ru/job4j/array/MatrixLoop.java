package ru.job4j.array;

public class MatrixLoop {
    public static void main(String[] args) {
        int[][] arr = {{4, 2, 3}, {7, 1}, {3, 5, 6, 4}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int res = arr[i][j];
                System.out.println(res);
            }
        }
    }
}
