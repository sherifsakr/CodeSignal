package Arcade.Intro._04_IslandOfKnowledge;

public class ArrayMaximalAdjacentDifference {

    int arrayMaximalAdjacentDifference(int[] inputArray) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < inputArray.length - 1; i++) {
            int abs = Math.abs(inputArray[i] - inputArray[i + 1]);
            if(max < abs)
                max = abs;
        }

        return max;
    }



}
