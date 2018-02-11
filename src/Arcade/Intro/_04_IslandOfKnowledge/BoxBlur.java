package Arcade.Intro._04_IslandOfKnowledge;

public class BoxBlur {

    int[][] boxBlur(int[][] image) {
        int rows = image.length;
        int columns = image[0].length;
        int[][] a = new int[rows - 2][];
        for (int index = 0; index < a.length; index++)
            a[index] = new int[columns - 2];

        for (int i = 0; i < rows - 2; i++)
            for (int j = 0; j < columns - 2; j++)
                a[i][j] = (image[i][j] + image[i][j + 1] + image[i][j + 2] + image[i + 1][j] + image[i + 1][j + 1] + image[i + 1][j + 2] + image[i + 2][j] + image[i + 2][j + 1] + image[i + 2][j + 2]) / 9;

        return a;
    }


}
