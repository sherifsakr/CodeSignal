package Arcade.TheCore._04_LoopTunnel;

public class LeastFactorial {

    int leastFactorial(int n) {
        int minimalK = 0;

        int fact = 1;
        for (int i = 1; i < 6; i++) {
            fact *= i;
            if (fact >= n) {
                minimalK = fact;
                break;
            }
        }

        return minimalK;
    }

}
