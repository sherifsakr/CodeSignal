package Arcade.Intro._08_DarkWilderness;

public class KnapsackLight {

    int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
        int carryingValue = 0;
        if(weight1 + weight2 <= maxW){
            carryingValue = value1 + value2;
        }else{
            if(weight1 <= maxW && weight2 <= maxW){
                carryingValue = Math.max(value1, value2);
            }else if(weight1 > maxW && weight2 <= maxW){
                carryingValue = value2;
            }else if(weight1 <= maxW && weight2 > maxW){
                carryingValue = value1;
            }
        }

        return carryingValue;
    }
}
