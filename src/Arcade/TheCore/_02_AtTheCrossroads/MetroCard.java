package Arcade.TheCore._02_AtTheCrossroads;

public class MetroCard {

    int[] metroCard(int lastNumberOfDays) {
        int[] card;
        if (lastNumberOfDays == 30) {
            card = new int[]{31};
        } else if (lastNumberOfDays == 31) {
            card = new int[]{28, 30, 31};
        } else {
            card = new int[]{31};
        }

        return card;
    }

}
