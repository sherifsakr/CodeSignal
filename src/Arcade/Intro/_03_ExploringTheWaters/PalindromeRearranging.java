package Arcade.Intro._03_ExploringTheWaters;

public class PalindromeRearranging {

    boolean palindromeRearranging(String inputString) {
        char[] a = new char[26];
        int oddChar = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            a[ch - 'a']++;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0)
                oddChar++;

            if (oddChar > 1)
                return false;
        }

        return true;
    }

}
