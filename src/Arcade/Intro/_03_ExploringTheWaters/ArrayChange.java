package Arcade.Intro._03_ExploringTheWaters;

public class ArrayChange {

    int arrayChange(int[] a) {
        boolean change = true;
        int changeNumber = 0;

        while (change) {
            change = false;
            for (int i = 1; i < a.length; i++) {
                if (a[i] <= a[i - 1]) {
                    a[i]++;
                    changeNumber++;
                    change = true;
                }
            }
        }

        return changeNumber;
    }

}
