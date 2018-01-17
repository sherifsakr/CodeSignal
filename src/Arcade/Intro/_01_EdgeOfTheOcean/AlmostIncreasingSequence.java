package Arcade.Intro._01_EdgeOfTheOcean;



import java.util.*;
import java.util.stream.Collectors;


public class AlmostIncreasingSequence {

    boolean almostIncreasingSequence(int[] sequence) {

        boolean seqFirst = getRemoveFirst(sequence);

        if(seqFirst) return true;

        boolean seqSecond = getRemoveSeconde(sequence);

        return seqSecond;
    }

    private boolean getRemoveFirst(int[] sequence) {
        int count = 0;
        int lastDeletedIndex = -1;
        for (int i = 0; i < sequence.length- 1; i++) {
            if(sequence[i] >= sequence[i + 1]){
                count++;
                lastDeletedIndex = i;
            }
            if(count > 1 || (lastDeletedIndex > 0 && sequence[lastDeletedIndex - 1] >= sequence[i])){
                count++;
                break;
            }
        }
        return (count <= 1);
    }

    private boolean getRemoveSeconde(int[] sequence) {
        int count = 0;
        int lastDeleteIndex = -1;

        for (int i = 1; i < sequence.length; i++) {
            if(sequence[i] <= sequence[i - 1]){
                count++;
                lastDeleteIndex = i;
                continue;
            }
            if(count > 1 || (lastDeleteIndex >= 1 && sequence[lastDeleteIndex - 1] >= sequence[i])){
                count++;
                break;
            }
        }

        return (count <= 1);
    }

}
