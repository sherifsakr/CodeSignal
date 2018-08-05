package Arcade.Intro._08_DarkWilderness;

public class DigitDegree {

    int digitDegree(int n) {
        if(n < 10 ) return 0;

        int degree = 0;

        while(n >= 10){
            int newN = 0;
            while(n > 0){
                newN += n % 10;
                n /= 10;
            }

            n = newN;
            degree++;
        }

        return degree;
    }

}
