package src.ch.teko.nb.HausaufgabenKontrollstrukturen;

import java.io.IOException;
import java.util.Scanner;

public class Kontrollstrukturen {

    static int average(int wert1, int wert2){
        return wert1 + (wert2 - wert1) / 2;
    }
    public static void main(String[] args) throws IOException {
        var  in = new Scanner (System.in);
        System.out.print("Number one: ");
        var wert1 = in.nextInt();
        System.out.print("Number two:");
        var wert2 = in.nextInt();
        System.out.format("Average: %d\n", average(wert1, wert2));
    }
}
