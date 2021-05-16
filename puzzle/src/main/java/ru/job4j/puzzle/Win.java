package ru.job4j.puzzle;

public class Win {

    public static boolean monoHorizontal(int[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != '1') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(int[][] board, int cell) {
        boolean result = true;
        for (int i = 0; i <= 5; i++) {
            if (board[cell][i] != '1') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean check(int[][] board) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == '1') {
                if (!monoHorizontal(board, i) || monoVertical(board, i)) {
                    rsl = false;
                    break;
                }
            }

        }
            return rsl;
    }
}

