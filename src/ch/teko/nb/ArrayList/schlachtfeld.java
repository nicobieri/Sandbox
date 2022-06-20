package src.ch.teko.nb.ArrayList;


public class schlachtfeld {


    public static void main(String[]args) {

        int[][] feld = new int[8][8];
        int feldnummer;

        int i;
        for (i = 0; i < feld.length; i++) {
            feldnummer = 1;
            for (int j = 0; j < feld[i].length; j++) {
                feld[i][j] = feldnummer++ + i;
            }
        }
    }
}

