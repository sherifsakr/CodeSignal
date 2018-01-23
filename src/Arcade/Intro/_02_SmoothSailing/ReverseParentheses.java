package Arcade.Intro._02_SmoothSailing;


public class ReverseParentheses {

    String reverseParentheses(String s) {
        StringBuilder builder = new StringBuilder(s);

        while (builder.lastIndexOf("(") != -1){
            int opening = builder.lastIndexOf("(");
            int closing = -2;
            String reversed = "";
            for (int i = opening; i < builder.length(); i++) {
                char ch = builder.charAt(i);
                if(ch == ')'){
                    closing = i;
                    break;
                }
            }
            reversed = new StringBuilder(builder.substring(opening + 1, closing)).reverse().toString();
            builder.replace(opening + 1, closing, reversed);
            builder.replace(opening, opening + 1, "");
            builder.replace(closing - 1, closing, "");
        }

        return builder.toString();
    }

}


/*
String reverseParentheses(String s) {
        StringBuilder builder = new StringBuilder(s);
        String reversed = "";
        while (builder.lastIndexOf("(") != -1){
            int lastIndex = builder.lastIndexOf("(");
            int firstIndex = builder.indexOf(")");
            StringBuilder temp = new StringBuilder();

            reversed = temp.append(builder.substring(lastIndex + 1, firstIndex)).reverse().toString();
            builder.replace(lastIndex + 1, firstIndex, reversed);
            builder.replace(lastIndex, lastIndex + 1, "");
            builder.replace(firstIndex - 1, firstIndex, "");


        }

        return builder.toString();
    }
 */


/*
        int listLen = openingBracket.size() - 1;
        while (builder.indexOf(")") != -1){
            int openIndex = openingBracket.get(listLen);
            int closeIndex = s.indexOf(")");
            StringBuilder temp = new StringBuilder();
            reversed = temp.append(builder.substring(openIndex + 1, closeIndex)).reverse().toString();
            builder.replace(openIndex + 1, closeIndex, reversed);
            builder.replace(openIndex, openIndex + 1, "");
            builder.replace(closeIndex - 1, closeIndex, "");
            listLen--;
        }
        */