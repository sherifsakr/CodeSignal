package Arcade.TheCore._03_CornerOf0sAnd1s;

public class EqualPairOfBits {

    int equalPairOfBits(int n, int m) {
        return n + m + 1 & ~m - n;
    }

}
