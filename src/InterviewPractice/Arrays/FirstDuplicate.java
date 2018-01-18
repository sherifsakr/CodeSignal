package InterviewPractice.Arrays;

import java.util.HashSet;
import java.util.Set;

/*
    Time Complexity = O(n)
    Space Complexity = O(n)
*/
public class FirstDuplicate {

    int firstDuplicate(int[] a) {
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < a.length; i++){
            if(!set.add(a[i]))
                return a[i];
        }

        return -1;
    }

}
