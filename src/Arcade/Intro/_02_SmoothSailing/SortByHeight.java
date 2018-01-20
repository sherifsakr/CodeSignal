package Arcade.Intro._02_SmoothSailing;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortByHeight {

    int[] sortByHeight(int[] a) {
        List<Integer> list = new ArrayList<>();

        for (int x : a) {
            if (x > -1)
                list.add(x);
        }

        Collections.sort(list);

        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                a[i] = list.get(counter);
                counter++;
            }
        }

        return a;

    }

}
