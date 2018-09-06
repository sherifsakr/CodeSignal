package Arcade.Intro._11_LandOfLogic;

public class LongestWord {

    String longestWord(String text) {

        String[] words = text.split(" ");

        String maxLenWord = "";

        for(String word : words){
            String s = removePunctuations(word);
            if(s.length() > maxLenWord.length()){
                maxLenWord = s;
            }
        }

        return maxLenWord;
    }

    private String removePunctuations(String s){
        String res = "";
        String maxLen = "";
        for (Character c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c))
                res += c;
            else{
                if(res.length() > maxLen.length()){
                    maxLen = res;
                    res = "";
                }
            }
        }

        if(maxLen.isEmpty()){
            maxLen = res;
        }

        return maxLen;
    }

}
