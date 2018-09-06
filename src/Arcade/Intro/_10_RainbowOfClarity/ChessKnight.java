package Arcade.Intro._10_RainbowOfClarity;

public class ChessKnight {

    int chessKnight(String cell) {
        char horizontal = cell.charAt(0);
        int vertical = Integer.parseInt(cell.substring(1));

        int move = 0;

        if(horizontal - 'a' >= 2){
            if(vertical - 2 >= 2){
                move += 2;
            }else if(vertical - 1 >= 1){
                move++;
            }
            if(vertical + 2 <= 8){
                move += 2;
            }else if(vertical + 1 <= 8){
                move++;
            }
        }else if(horizontal - 'a' == 1) {
            if (vertical - 2 >= 2) {
                move++;
            }
            if (vertical + 2 <= 8) {
                move++;
            }
        }

        if('h' - horizontal >= 2){
            if(vertical - 2 >= 1){
                move += 2;
            }else if(vertical - 1 >= 1){
                move++;
            }
            if(vertical + 2 <= 8){
                move += 2;
            }else if(vertical + 1 <= 8){
                move++;
            }
        }else if('h' - horizontal == 1){
            if (vertical - 2 >= 2) {
                move++;
            }
            if(vertical + 2 <= 8) {
                move++;
            }
        }


        return move;
    }

}


/*
        if(horizontal - 'a' >= 2){ // sol taraf
            if(vertical - 2 >= 2){
                move += 2;
            }else if(vertical - 1 >= 1){
                move++;
            }
            if(vertical + 2 <= 8){
                move += 2;
            }else if(vertical + 1 <= 8){
                move++;
            }
        }

        if(horizontal)
 */