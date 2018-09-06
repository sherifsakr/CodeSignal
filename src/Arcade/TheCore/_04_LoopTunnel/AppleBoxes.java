package Arcade.TheCore._04_LoopTunnel;

public class AppleBoxes {

    int appleBoxes(int k) {
        int red = 0;
        int yellow = 0;

        for (int i = 1; i <= k; i++) {
            int apples = i * i;
            if (i % 2 == 1) {
                yellow += apples;
            } else {
                red += apples;
            }
        }

        return red - yellow;
    }

}
