package Arcade.Intro._04_IslandOfKnowledge;

import java.util.Arrays;

public class AvoidObstacles {

    int avoidObstacles(int[] inputArray) {

        Arrays.sort(inputArray);

        int curNode = 0;
        boolean find = true;
        for (int i = 1; i <= 40; i++) {
            find = true;
            curNode = i;
            for (int j = 0; j < inputArray.length - 1; j++) {
                if (inputArray[j] % curNode == 0) {
                    find = false;
                    break;
                }
            }
            if (find) {
                break;
            }
        }
        return curNode;
    }


}
