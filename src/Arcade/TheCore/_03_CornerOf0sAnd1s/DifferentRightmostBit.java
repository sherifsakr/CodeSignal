package Arcade.TheCore._03_CornerOf0sAnd1s;

public class DifferentRightmostBit {

    int differentRightmostBit(int n, int m) {
        return (n ^ m) & -(n ^ m);
    }

}
