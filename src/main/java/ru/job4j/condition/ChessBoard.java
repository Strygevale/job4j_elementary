package ru.job4j.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        boolean board = boardFields(x1) && boardFields(y1) && boardFields(x2) && boardFields(y2);
        if (board && (Math.abs(x2 - x1) == Math.abs(y2 - y1))) {
            rsl = Math.abs(x2 - x1);
        }
        return rsl;
    }

    private static boolean boardFields(int num) {
        return num >= 0 && num <= 7;
    }

}
