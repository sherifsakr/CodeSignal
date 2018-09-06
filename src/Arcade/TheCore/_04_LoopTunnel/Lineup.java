package Arcade.TheCore._04_LoopTunnel;

public class Lineup {

    int lineUp(String commands) {
        if (commands.length() == 0)
            return 0;

        int count = 0;

        int student = 0;

        for (char ch : commands.toCharArray()) {
            if (ch == 'L')
                student++;
            else if (ch == 'R')
                student--;
            else
                student += 2;

            if (student % 2 == 0)
                count++;
        }

        return count;
    }

}
