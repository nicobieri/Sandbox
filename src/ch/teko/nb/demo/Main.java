package ch.teko.nb.demo;

import src.ch.teko.nb.demo.OOP;

public class Main {
    public static void main(String[] args) {
        OOP m = new OOP(1);
       // m.name = "hello";     //Datenkapselung
       // m.id = 3;
        // System.out.println(m.name);

        int n = 2_147_483_647;
        n++;
         System.out.format("%d\n", n);
    }

}
