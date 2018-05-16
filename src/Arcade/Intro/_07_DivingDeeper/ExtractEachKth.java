package Arcade.Intro._07_DivingDeeper;

import java.util.ArrayList;
import java.util.List;

public class ExtractEachKth {

    int[] extractEachKth(int[] inputArray, int k) {
        int extractingNumber = inputArray.length / 3;
        List<Integer> list = new ArrayList<>();

        int times = 1;
        int j = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (times * k - 1 != i) {
                list.add(inputArray[i]);
                j++;
            } else if (times * k - 1 == i) {
                times++;
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

}
