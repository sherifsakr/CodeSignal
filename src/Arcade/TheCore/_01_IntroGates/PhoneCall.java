package Arcade.TheCore._01_IntroGates;

public class PhoneCall {

    int phoneCall(int min1, int min2_10, int min11, int s) {
        int minute = 0;

        if (s >= min1) {
            s -= min1;
            minute++;
        }

        if (s >= min2_10) {
            int call = s / min2_10;
            if (call > 9) call = 9;
            minute += call;
            s -= min2_10 * call;
        }

        if (s >= min11 && minute == 10) {
            int call = s / min11;
            minute += call;
            s -= min11 * call;
        }

        return minute;
    }

}
