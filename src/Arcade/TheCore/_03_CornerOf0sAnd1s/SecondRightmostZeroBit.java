package Arcade.TheCore._03_CornerOf0sAnd1s;

public class SecondRightmostZeroBit {

    int secondRightmostZeroBit(int n) {
        return ~(n | n + 1) & -~(n | n + 1);
    }

}
