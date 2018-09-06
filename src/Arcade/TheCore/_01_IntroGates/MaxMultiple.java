package Arcade.TheCore._01_IntroGates;

public class MaxMultiple {

    int maxMultiple(int divisor, int bound) {
        return bound - (bound % divisor);
    }

}
