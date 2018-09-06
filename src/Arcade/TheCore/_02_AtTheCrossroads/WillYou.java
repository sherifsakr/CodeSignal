package Arcade.TheCore._02_AtTheCrossroads;

public class WillYou {

    boolean willYou(boolean young, boolean beautiful, boolean loved) {
        return (young && beautiful && !loved) || (loved && (!young || !beautiful));
    }

}
