package Arcade.Intro._01_EdgeOfTheOcean;

import java.util.ArrayList;
import java.util.List;

public class MatrixElementSum {

    int matrixElementsSum(int[][] matrix) {

        int sum = 0;
        List<Integer> columns = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0) {
                    if (matrix[i][j] > 0) {
                        sum += matrix[i][j];
                    } else {
                        columns.add(j);
                    }
                } else {
                    if (matrix[i][j] == 0) {
                        columns.add(j);
                    } else if (!columns.contains(j)) {
                        sum += matrix[i][j];
                    }
                }
            }
        }

        return sum;

    }

}


/*
int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i == 0){
                    if(matrix[i][j] > 0) {
                        sum += matrix[i][j];
                    }
                }else if((matrix[i - 1][j] != 0 && matrix[i][j] > 0)){
                    sum += matrix[i][j];
                }
            }
        }

        return sum;
 */