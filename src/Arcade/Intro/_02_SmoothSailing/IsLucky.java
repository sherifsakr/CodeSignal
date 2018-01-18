package Arcade.Intro._02_SmoothSailing;

public class IsLucky {

    boolean isLucky(int n) {
        int len = (int) (Math.log10(n) + 1);
        int firstHalfSum = 0;
        int secondHalfSum = 0;
        int counter = len;

        while (n > 0) {
            int digit = n % 10;
            if (counter > len / 2) {
                secondHalfSum += digit;
            } else {
                firstHalfSum += digit;
            }

            n /= 10;
            counter--;
        }

        return (firstHalfSum == secondHalfSum);
    }


}
