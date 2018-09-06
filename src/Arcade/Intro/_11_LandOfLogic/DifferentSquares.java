package Arcade.Intro._11_LandOfLogic;

import java.util.HashSet;
import java.util.Set;

public class DifferentSquares {

    int differentSquares(int[][] matrix) {
        Set<String> set = new HashSet<>();

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                String s = String.valueOf(matrix[i][j]) +
                           String.valueOf(matrix[i][j + 1]) +
                           String.valueOf(matrix[i+1][j]) +
                           String.valueOf(matrix[i + 1][j + 1]);
                set.add(s);
            }
        }

        return set.size();
    }

}
