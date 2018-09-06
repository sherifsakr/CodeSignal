package Arcade.TheCore._04_LoopTunnel;

public class IncreaseNumberRoundness {

    boolean increaseNumberRoundness(int n) {
        String num = Integer.toString(n);

        int firstZeroPos = num.indexOf('0');
        int lastZeroPos = num.lastIndexOf('0');

        if ((firstZeroPos == lastZeroPos && firstZeroPos == num.length() - 1) || firstZeroPos == -1)
            return false;

        for (int i = firstZeroPos; i < lastZeroPos; i++) {
            if (num.charAt(i) != '0') {
                return true;
            }
        }

        if (firstZeroPos == lastZeroPos && firstZeroPos != num.length() - 1)
            return true;

        return false;
    }

}
