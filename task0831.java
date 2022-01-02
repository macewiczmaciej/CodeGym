package en.codegym.task.jdk13.task08.task0831;

import java.util.Arrays;

/* 
Favorite board games
*/

public class Solution {

    public static BoardGame[] collection = new BoardGame[5];

    public static void main(String[] args) {
        BoardGame chess = new BoardGame();
        chess.name = "Battleship";
        collection[0] = chess;

        //write your code here
        BoardGame monopoly = new BoardGame();
        monopoly.name = "Monopoly";
        collection[1] = monopoly;

        BoardGame scrabble = new BoardGame();
        scrabble.name = "Scrabble";
        collection[2] = scrabble;

        BoardGame jenga = new BoardGame();
        jenga.name = "Jenga";
        collection[3]= jenga;

        BoardGame upwords = new BoardGame();
        upwords.name = "UpWords";
        collection[4] = upwords;
        
        System.out.println(Arrays.toString(collection));
    }
}
