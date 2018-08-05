package Arcade.Intro._08_DarkWilderness;

public class BishopAndPawn {

    boolean bishopAndPawn(String bishop, String pawn) {
        char bishopLetter = bishop.charAt(0);
        char bishopNumber = bishop.charAt(1);

        char pawnLetter = pawn.charAt(0);
        char pawnNumber = pawn.charAt(1);

        if(bishopLetter - pawnLetter == 0) return false;

        if(Math.abs(bishopLetter - pawnLetter) % 2 == 0){
            if(Math.abs(bishopNumber - pawnNumber) % 2 == 0)
                return true;
        }else{
            if(Math.abs(bishopNumber - pawnNumber) % 2 == 1)
                return true;
        }

        return false;
    }

}
