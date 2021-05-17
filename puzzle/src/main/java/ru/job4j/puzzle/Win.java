package ru.job4j.puzzle;

public class Win {
    public static boolean monoHorizontal(int[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(int[][] board, int cell) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][cell] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && monoHorizontal(board, i) || monoVertical(board, i)) {
                    rsl = true;
                    break;
            }
        }
            return rsl;
    }
}
//тип_переменной[количество_рядов][количество_элементов_в ряду]
//board[row][i] != 1 //тут проверяем весь ряд row с индексами всего массива на заполненность 1.
//board[i][cell] != 1 //тут проверяем весь столбец cell с индексами всего массива на заполненность 1.
//board[i][i] == 1 && //если на доске по диагонали от 00 до конца индекса и вся строка или весь столбец равны 1, то возвращаем WIN