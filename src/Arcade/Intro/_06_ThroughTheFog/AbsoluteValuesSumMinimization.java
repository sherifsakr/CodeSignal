package Arcade.Intro._06_ThroughTheFog;

public class AbsoluteValuesSumMinimization {

    int absoluteValuesSumMinimization(int[] a) {

        int min = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            int temp = 0;
            for (int j = 0; j < a.length; j++) {
                temp += Math.abs(a[i] - a[j]);
            }
            if (temp < min) {
                min = temp;
                index = a[i];
            }
        }

        return index;

    }

}
