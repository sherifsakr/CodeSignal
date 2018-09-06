package Arcade.TheCore._03_CornerOf0sAnd1s;

public class KillKthBit {

    int killKthBit(int n, int k) {
        return n & (~(1 << k - 1));
    }

}
