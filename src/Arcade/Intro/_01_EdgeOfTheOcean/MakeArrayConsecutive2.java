package Arcade.Intro._01_EdgeOfTheOcean;

import java.util.Arrays;

public class MakeArrayConsecutive2 {

    int makeArrayConsecutive2(int[] statues) {

        Arrays.sort(statues);
        int statueSize = 0;
        for (int i = 0; i < statues.length - 1; i++) {
            if (statues[i] - statues[i + 1] != -1)
                statueSize += statues[i + 1] - statues[i] - 1;
        }

        return statueSize;
    }


}
