package Arcade.Intro._02_SmoothSailing;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AllLongestStrings {

    String[] allLongestStrings(String[] inputArray) {

        List<String> list = new ArrayList<>();
        int maxLength = 0;
        for (int i = 0; i < inputArray.length; i++) {
            int stringLen = inputArray[i].length();
            if (stringLen > maxLength) {
                maxLength = stringLen;
                list.clear();
                list.add(inputArray[i]);
            } else if (stringLen == maxLength) {
                list.add(inputArray[i]);
            }
        }

        return list.stream().toArray(String[]::new);
    }

}
