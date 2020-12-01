package ru.job4j.puzzle;

public class Win {
    public static boolean monoVertical(int[][] board, int column) {
        boolean rsl = true;
        for (int j = 0; j < board.length; j++) {
            if (board[j][column] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }


        public static boolean monoHorizontal(int[][] board, int row) {
            boolean rsl = true;
            for (int i = 0; i < board[row].length; i++) {
                if (board[row][i] != 1) {
                    rsl = false;
                    break;
                }
            }
            return rsl;
        }

    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1) {
                if (monoVertical(board, i) || monoHorizontal(board, i)) {
                    rsl = true;
                    break;
                }
            }
        }
        return rsl;
    }

}
