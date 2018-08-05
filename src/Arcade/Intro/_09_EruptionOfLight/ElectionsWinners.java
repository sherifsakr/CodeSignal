package Arcade.Intro._09_EruptionOfLight;

import java.util.Arrays;

public class ElectionsWinners {

    int electionsWinners(int[] votes, int k) {
        Arrays.sort(votes);

        int maxVote = votes[votes.length - 1];
        int candidates = 0;

        for(int candidate : votes){
            if(candidate + k > maxVote)
                candidates++;
        }

        if(votes[votes.length - 2] != maxVote && candidates == 0)
            candidates++;

        return candidates;
    }

}
