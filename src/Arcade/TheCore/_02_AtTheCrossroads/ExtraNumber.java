package Arcade.TheCore._02_AtTheCrossroads;

public class ExtraNumber {

    int extraNumber(int a, int b, int c) {
        if (a == c) return b;
        if (a == b) return c;
        return a;
    }

}
