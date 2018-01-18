package Arcade.Intro._02_SmoothSailing;

import java.util.HashMap;
import java.util.Map;

public class CommonCharacterCount {


    int commonCharacterCount(String s1, String s2) {

        Map<Character, Integer> map1;
        Map<Character, Integer> map2;

        map1 = createMap(s1);
        map2 = createMap(s2);

        int commonCounter = 0;
        StringBuilder builder = new StringBuilder("");

        if (s1.length() <= s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                char ch = s1.charAt(i);
                if (builder.toString().indexOf(ch) != -1)
                    continue;
                if (map2.containsKey(ch)) {
                    commonCounter += Math.min(map1.get(ch), map2.get(ch));
                    builder.append(ch);
                }
            }
        } else {
            for (int i = 0; i < s2.length(); i++) {
                char ch = s2.charAt(i);
                if (builder.toString().indexOf(ch) != -1)
                    continue;
                if (map1.containsKey(ch)) {
                    commonCounter += Math.min(map1.get(ch), map2.get(ch));
                    builder.append(ch);
                }
            }
        }

        return commonCounter;

    }

    private Map<Character, Integer> createMap(String s1) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            if (map.containsKey(s1.charAt(i))) {
                map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
            } else {
                map.put(s1.charAt(i), 1);
            }
        }

        return map;
    }


}
