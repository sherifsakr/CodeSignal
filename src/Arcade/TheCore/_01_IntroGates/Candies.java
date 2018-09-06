package Arcade.TheCore._01_IntroGates;

public class Candies {

    int candies(int n, int m) {
        int remain = m % n;

        return m - remain;
    }

}
