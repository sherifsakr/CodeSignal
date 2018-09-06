package Arcade.Intro._11_LandOfLogic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumUpNumbers {

    int sumUpNumbers(String inputString) {

        int sum = 0;

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(inputString);

        while(matcher.find()){
            int num = Integer.parseInt(matcher.group(0));
            sum += num;
        }

        return sum;

    }

}
