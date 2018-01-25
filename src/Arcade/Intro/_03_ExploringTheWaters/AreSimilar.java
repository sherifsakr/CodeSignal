package Arcade.Intro._03_ExploringTheWaters;

public class AreSimilar {

    boolean areSimilar(int[] a, int[] b) {
        boolean changed = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                for (int j = i + 1; j < b.length; j++) {
                    if (a[i] == b[j] && a[j] != b[j]) {
                        int temp = b[i];
                        b[i] = b[j];
                        b[j] = temp;
                        changed = true;
                        break;
                    }
                }
            }
            if (changed) break;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }

        return true;
    }

}