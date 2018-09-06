package Arcade.Intro._11_LandOfLogic;

public class SpiralNumbers {

    int[][] spiralNumbers(int n) {

        int[][] spiralArr = new int[n][n];

        int value = 1;
        int minCol = 0;
        int maxCol = n - 1;
        int minRow = 0;
        int maxRow = n - 1;

        while (value <= n * n) {
            for (int i = minCol; i <= maxCol; i++) {
                spiralArr[minRow][i] = value;
                value++;
            }

            for (int i = minRow + 1; i <= maxRow; i++) {
                spiralArr[i][maxCol] = value;
                value++;
            }

            for (int i = maxCol - 1; i >= minCol; i--) {
                spiralArr[maxRow][i] = value;
                value++;
            }

            for (int i = maxRow - 1; i >= minRow + 1; i--) {
                spiralArr[i][minCol] = value;
                value++;
            }

            minCol++;
            minRow++;
            maxCol--;
            maxRow--;
        }

    return spiralArr;
    }
}
