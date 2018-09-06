package Arcade.TheCore._03_CornerOf0sAnd1s;

public class RangeBitCount {

    int rangeBitCount(int a, int b) {
        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum += Integer.bitCount(i);
        }

        return sum;
    }

}
