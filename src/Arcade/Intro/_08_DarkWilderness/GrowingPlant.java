package Arcade.Intro._08_DarkWilderness;

public class GrowingPlant {

    int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
        int day = 1;
        desiredHeight -= upSpeed;

        while (desiredHeight > 0){
            desiredHeight += downSpeed;
            day++;
            desiredHeight -= upSpeed;
        }

        return day;
    }

}
