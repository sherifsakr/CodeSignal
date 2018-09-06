package Arcade.TheCore._04_LoopTunnel;

public class MagicalWell {

    int magicalWell(int a, int b, int n) {

        int earning = 0;

        for (int i = 0; i < n; i++) {
            earning += a * b;
            a++;
            b++;
        }

        return earning;
    }

}
