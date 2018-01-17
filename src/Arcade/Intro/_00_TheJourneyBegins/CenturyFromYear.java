package Arcade.Intro._00_TheJourneyBegins;

public class CenturyFromYear {

    int centuryFromYear(int year) {
        int century = year / 100;
        if (year % 100 == 0)
            return century;

        return century + 1;
    }

}
