package Arcade.TheCore._01_IntroGates;

public class LateRide {

    int lateRide(int n) {
        int hour = n / 60;
        int minute = n % 60;

        int sum = (hour % 10) + hour / 10;
        sum += (minute % 10) + minute / 10;

        return sum;
    }

}
