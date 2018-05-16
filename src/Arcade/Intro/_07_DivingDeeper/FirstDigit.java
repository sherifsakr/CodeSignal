package Arcade.Intro._07_DivingDeeper;

public class FirstDigit {

    char firstDigit(String inputString) {
        char[] chars = inputString.toCharArray();
        char first = 0;
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if(aChar >= 48 && aChar <= 57){
                first = aChar;
                break;
            }
        }
        
        return first;
    }

}
