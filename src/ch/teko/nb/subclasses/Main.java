package src.ch.teko.nb.subclasses;

import src.ch.teko.nb.subclasses.sub.Messi;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ramos");

        Ramos psg = new Ramos(95);
        //psg.tackling; geht nicht!
        psg.ramosPlays();
        // yellow Card Protected

        System.out.println(" ");
        System.out.println("Messi");
        Messi psg1 = new Messi(75);
        //psg1.dribbling; geht nicht!
        // psg1.messiPass(); geht nicht!
        psg1.messiPass();
        // messiPass public static void
        psg1.redCard();





        System.out.println(" ");

        System.out.println("Ronaldo");

        System.out.println(" ");



    }
}
