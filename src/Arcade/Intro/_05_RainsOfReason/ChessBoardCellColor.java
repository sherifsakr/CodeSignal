package Arcade.Intro._05_RainsOfReason;

public class ChessBoardCellColor {

    boolean chessBoardCellColor(String cell1, String cell2) {

        int l = Math.abs(cell1.charAt(0) - cell2.charAt(0));
        int n = Math.abs(cell1.charAt(1) - cell2.charAt(1));

        if ((l % 2 == 0 && n % 2 == 0) || (l % 2 == 1 && n % 2 == 1))
            return true;

        return false;

    }


}
