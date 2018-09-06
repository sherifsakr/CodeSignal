package Arcade.Intro._11_LandOfLogic;

public class ValidTime {

    boolean validTime(String time) {
        String[] times = time.split(":");
        int hour = Integer.parseInt(times[0]);
        int minutes = Integer.parseInt(times[1]);


        return ((hour >= 0 && hour <= 23) && (minutes >= 0 && minutes <= 59));
    }

}
