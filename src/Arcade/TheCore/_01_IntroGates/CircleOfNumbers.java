package Arcade.TheCore._01_IntroGates;

public class CircleOfNumbers {

    int circleOfNumbers(int n, int firstNumber) {
        if (firstNumber >= (n / 2))
            return firstNumber - (n / 2);

        return firstNumber + (n / 2);
    }

}
