package Arcade.Intro._11_LandOfLogic;

public class MessageFromBinaryCode {

    String messageFromBinaryCode(String code) {
        String str = "";

        for (int i = 0; i < code.length()/8; i++) {

            int a = Integer.parseInt(code.substring(8*i,(i+1)*8),2);
            str += (char)(a);
        }

        return str;
    }

}
