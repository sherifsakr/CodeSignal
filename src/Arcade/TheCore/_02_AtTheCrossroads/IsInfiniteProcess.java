package Arcade.TheCore._02_AtTheCrossroads;

public class IsInfiniteProcess {

    boolean isInfiniteProcess(int a, int b) {
        return !(b >= a && (b - a) % 2 == 0);
    }

}
