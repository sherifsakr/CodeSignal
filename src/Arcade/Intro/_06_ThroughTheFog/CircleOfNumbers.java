package Arcade.Intro._06_ThroughTheFog;

public class CircleOfNumbers {

    int circleOfNumbers(int n, int firstNumber) {

        int h = n / 2;

        if (firstNumber - h < 0)
            return firstNumber + h;
        else
            return firstNumber - h;

    }

}
