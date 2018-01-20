package InterviewPractice.Arrays;

public class FirstNotRepeatingCharacter {

    char firstNotRepeatingCharacter(String s) {

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int lastIndex = s.lastIndexOf(ch);
            if(i != lastIndex && ch != '.'){
                s = s.replaceAll(String.valueOf(ch), ".");
            }else{
                if(ch != '.')
                    return ch;
            }
        }

        return '_';
    }

}
