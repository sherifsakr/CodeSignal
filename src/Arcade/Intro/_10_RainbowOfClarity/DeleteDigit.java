package Arcade.Intro._10_RainbowOfClarity;

public class DeleteDigit {

    int deleteDigit(int n) {
        int max = 0;
        String s = String.valueOf(n);

        for(int i = 0; i < s.length(); i++){
            String temp = s.substring(0, i) + s.substring(i + 1);
            int newN = Integer.parseInt(temp);
            max = Math.max(max, newN);
        }

        return max;
    }

}
