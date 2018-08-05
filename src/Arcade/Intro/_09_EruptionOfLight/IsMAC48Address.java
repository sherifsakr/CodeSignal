package Arcade.Intro._09_EruptionOfLight;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsMAC48Address {

    boolean isMAC48Address(String inputString) {
        String regex = "([A-F0-9]{2}\\-){5}[A-F0-9]{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputString);
        return matcher.matches();
    }

}
