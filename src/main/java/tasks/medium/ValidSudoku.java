package tasks.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {

        Map<Integer, Set<Character>> rowsMap = new HashMap<>();
        Map<Integer, Set<Character>> colsMap = new HashMap<>();
        Map<Integer, Set<Character>> boxesMap = new HashMap<>();

        int boxNumber;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    continue;
                }

                rowsMap.computeIfAbsent(i, k -> new HashSet<>());
                if (!rowsMap.get(i).add(board[i][j])) {
                    return false;
                }

                colsMap.computeIfAbsent(j, k -> new HashSet<>());
                if (!colsMap.get(j).add(board[i][j])) {
                    return false;
                }

                boxNumber = boxNumber(i, j);
                boxesMap.computeIfAbsent(boxNumber, k -> new HashSet<>());
                if (!boxesMap.get(boxNumber).add(board[i][j])) {
                    return false;
                }
            }
        }

        return true;
    }

    private int boxNumber(int i, int j) {
        return boxLinearNumber(i) + boxLinearNumber(j) * 3;
    }

    private int boxLinearNumber(int i) {
        if (i < 3) {
            return 0;
        } else if (i < 6) {
            return 1;
        } else {
            return 2;
        }
    }
}
