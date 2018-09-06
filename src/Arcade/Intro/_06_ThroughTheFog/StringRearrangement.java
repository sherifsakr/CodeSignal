package Arcade.Intro._06_ThroughTheFog;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringRearrangement {

    boolean stringsRearrangement(String[] inputArray) {
        List<String> list = Arrays.asList(inputArray);
        List<String> perm = permute(list,0);

        return true;
    }

    List<String> permute(java.util.List<String> arr, int k){
        for(int i = k; i < arr.size(); i++){
            java.util.Collections.swap(arr, i, k);
            permute(arr, k+1);
            java.util.Collections.swap(arr, k, i);
        }
        return arr;
    }

}


/*
Arrays.sort(inputArray);

        if(inputArray.length != 2){
            for (int i = 0; i < inputArray.length - 1; i++) {
                if(inputArray[i].equals(inputArray[i + 1]) && i + 2 < inputArray.length - 1){
                    String temp = inputArray[i + 1];
                    inputArray[i + 1] = inputArray[i + 2];
                    inputArray[i + 2] = temp;
                }
            }
        }else{
            return !(inputArray[0].equals(inputArray[1]));
        }


        for (int i = 0; i < inputArray.length - 1; i++) {
            if(inputArray[i].equals(inputArray[i + 1]))
                continue;

            char[] f = inputArray[i].toCharArray();
            char[] s = inputArray[i + 1].toCharArray();

            int diff = 0;
            for (int j = 0; j < f.length; j++) {
                if(f[j] != s[j]){
                    diff++;
                }

                if(diff > 1)
                    return false;
            }

            if(diff == 0)
                return false;
        }

        return true;
 */

/*
    boolean stringsRearrangement(String[] inputArray) {
        Arrays.sort(inputArray);

        if(inputArray.length != 2){
            for (int i = 0; i < inputArray.length - 1; i++) {
                if(inputArray[i].equals(inputArray[i + 1]) && i + 2 < inputArray.length - 1){
                    String temp = inputArray[i + 1];
                    inputArray[i + 1] = inputArray[i + 2];
                    inputArray[i + 2] = temp;
                }
            }
        }else{
            return !(inputArray[0].equals(inputArray[1]));
        }


        for (int i = 0; i < inputArray.length - 1; i++) {
            if(inputArray[i].equals(inputArray[i + 1]))
                continue;

            char[] f = inputArray[i].toCharArray();
            char[] s = inputArray[i + 1].toCharArray();

            int diff = 0;
            for (int j = 0; j < f.length; j++) {
                if(f[j] != s[j]){
                    diff++;
                }

                if(diff > 1)
                    return false;
            }

            if(diff == 0)
                return false;
        }

        return true;
    }
 */