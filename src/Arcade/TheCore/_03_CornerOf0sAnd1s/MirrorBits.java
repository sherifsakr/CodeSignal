package Arcade.TheCore._03_CornerOf0sAnd1s;

public class MirrorBits {

    int mirrorBits(int a) {
        String binary = Integer.toBinaryString(a);
        binary = new StringBuilder(binary).reverse().toString();

        return Integer.parseInt(binary, 2);
    }

}
