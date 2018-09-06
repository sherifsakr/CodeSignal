package Arcade.Intro._10_RainbowOfClarity;

public class LineEncoding {

    String lineEncoding(String s) {

        char curr = s.charAt(0);
        int chNum = 1;
        String retStr = "";

        for(int i = 1; i < s.length() - 1; i++){
            if(s.charAt(i) == curr){
                chNum++;
            }else{
                retStr += (chNum > 1) ? chNum : "";
                retStr += Character.toString(curr);
                curr = s.charAt(i);
                chNum = 1;
            }
        }

        if(s.charAt(s.length() - 1) == curr){
            chNum++;
            retStr += (chNum > 1) ? chNum : "";
            retStr += Character.toString(curr);
        }else{
            retStr += (chNum > 1) ? chNum : "";
            retStr += Character.toString(curr);
            retStr += Character.toString(s.charAt(s.length() - 1));
        }

        return retStr;
    }

}
