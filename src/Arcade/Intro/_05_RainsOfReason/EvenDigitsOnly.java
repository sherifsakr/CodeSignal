package Arcade.Intro._05_RainsOfReason;

public class EvenDigitsOnly {

    boolean evenDigitsOnly(int n) {

        while (n > 0) {
            int i = n % 10;
            if (i % 2 != 0)
                return false;

            n = n / 10;
        }

        return true;
    }

}
