package Arcade.Intro._07_DivingDeeper;

public class ArrayMaxConsecutiveSum {

    int arrayMaxConsecutiveSum(int[] inputArray, int k) {
        int max = 0;
        int currSum = 0;

        for (int i = 0; i < k - 1; i++) {
            currSum += inputArray[i];
        }

        for(int i = k - 1; i < inputArray.length; i++){
            currSum += inputArray[i];
            max = (currSum > max) ? currSum : max;

            currSum -= inputArray[i - k + 1];
        }


        return max;
    }

}
