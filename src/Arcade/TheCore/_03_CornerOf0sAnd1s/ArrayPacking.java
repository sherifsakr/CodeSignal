package Arcade.TheCore._03_CornerOf0sAnd1s;

public class ArrayPacking {

    int arrayPacking(int[] a) {
        int n = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            n <<= 8;
            n += a[i];
        }
        return n;
    }

}
