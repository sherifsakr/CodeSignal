package Arcade.TheCore._04_LoopTunnel;

public class AdditionWithoutCarrying {

    int additionWithoutCarrying(int param1, int param2) {
        if (param1 == 0 && param2 == 0)
            return 0;

        StringBuilder sb = new StringBuilder();

        while (param1 > 0 && param2 > 0) {
            int par1 = param1 % 10;
            int par2 = param2 % 10;

            int sum = par1 + par2;
            sb.append(Integer.toString(sum % 10));

            param1 /= 10;
            param2 /= 10;
        }

        if (param1 > 0) {
            while (param1 > 0) {
                sb.append(Integer.toString(param1 % 10));
                param1 /= 10;
            }
        } else if (param2 > 0) {
            while (param2 > 0) {
                sb.append(Integer.toString(param2 % 10));
                param2 /= 10;
            }
        }

        return Integer.parseInt(sb.reverse().toString());
    }

}
