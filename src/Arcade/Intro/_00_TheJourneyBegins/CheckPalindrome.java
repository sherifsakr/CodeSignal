package Arcade.Intro._00_TheJourneyBegins;

public class CheckPalindrome {

    boolean checkPalindrome(String inputString) {
        return inputString.equals(new StringBuilder(inputString).reverse().toString());
    }

}
