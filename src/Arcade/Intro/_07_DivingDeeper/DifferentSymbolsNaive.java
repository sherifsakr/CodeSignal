package Arcade.Intro._07_DivingDeeper;

import java.util.HashSet;
import java.util.Set;

public class DifferentSymbolsNaive {

    int differentSymbolsNaive(String s) {
        Set<Character> characterSet = new HashSet<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            characterSet.add(aChar);
        }

        return characterSet.size();
    }

}
