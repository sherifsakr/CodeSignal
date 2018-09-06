package Arcade.TheCore._02_AtTheCrossroads;

public class KnapsackLight {

    int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
        if (weight1 + weight2 <= maxW)
            return value1 + value2;

        int max = 0;
        if (weight1 <= maxW)
            if (weight2 <= maxW)
                max = Math.max(value1, value2);
            else
                return value1;
        else if (weight2 <= maxW)
            return value2;
        return max;
    }


}
