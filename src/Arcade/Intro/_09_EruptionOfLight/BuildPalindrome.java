package Arcade.Intro._09_EruptionOfLight;

public class BuildPalindrome {

    String buildPalindrome(String st) {
        if(isPalindrome(st)) return st;

        StringBuilder sb = new StringBuilder(st);
        sb.append(st.charAt(0));
        int i = 1;
        while(!isPalindrome(sb.toString())){
            sb.insert(sb.length() - i, st.substring(i, i+1));
            i++;
        }

        return sb.toString();
    }

    private boolean isPalindrome(String s){
        int i = 0;
        int j = s.length() - 1;
        char[] arr = s.toCharArray();
        while(i < j){
            if(arr[i] == arr[j]){
                i++;
                j--;
            }else{
                return false;
            }
        }

        return true;
    }

}
