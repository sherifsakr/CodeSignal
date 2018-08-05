package Arcade.Intro._08_DarkWilderness;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongestDigitsPrefix {

    String longestDigitsPrefix(String inputString) {
        if(inputString.contains(" ")) return "";

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(inputString);

        String longestDigits = "";

        while (matcher.find()){
            String match = matcher.group();
            if(match.length() > longestDigits.length()){
                longestDigits = match;
            }
        }

        return longestDigits;
    }

}
