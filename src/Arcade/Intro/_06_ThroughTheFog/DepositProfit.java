package Arcade.Intro._06_ThroughTheFog;

public class DepositProfit {

    int depositProfit(int deposit, int rate, int threshold) {
        int year = 0;
        float dep = deposit;
        while (dep < threshold){
            dep += ((dep * rate) / 100);
            year++;
        }

        return year;
    }

}
