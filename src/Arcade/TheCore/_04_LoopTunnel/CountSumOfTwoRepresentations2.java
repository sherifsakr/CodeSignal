package Arcade.TheCore._04_LoopTunnel;

public class CountSumOfTwoRepresentations2 {

    int countSumOfTwoRepresentations2(int n, int l, int r) {
        int count = 0;

        while (l != r) {
            if (l + r > n) {
                r--;
            } else if (l + r < n) {
                l++;
            } else {
                count++;
                l++;
            }
        }

        if (l + r == n) count++;

        return count;
    }

}
