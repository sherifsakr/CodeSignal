package Arcade.Intro._04_IslandOfKnowledge;

public class AreEquallyStrong {

    boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        return ((Math.max(yourLeft, yourRight) == Math.max(friendsLeft, friendsRight))
                && (Math.min(yourLeft, yourRight) == Math.min(friendsLeft, friendsRight)));
    }

}
