package src.ch.teko.nb.subclasses;

import src.ch.teko.nb.subclasses.sub.Messi;
import src.ch.teko.nb.subclasses.sub.Ronaldo;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Spieler pass = new Spieler();
        System.out.println(pass);
        System.out.println(pass.getGetPass());

        System.out.println(" ");

        System.out.println("Messi");
        Messi trick = new Messi();
        System.out.println(trick.dribbling);
        System.out.println(trick.getPass);
        System.out.println(trick.getBall);
        System.out.println(pass.getGetPass());

        System.out.println(" ");

        System.out.println("Ronaldo");
        Ronaldo shot = new Ronaldo();
        System.out.println(shot.getShot());
        System.out.println(pass.getGetPass());

        System.out.println(" ");

        System.out.println("Ramos");
        Ramos dev = new Ramos();
        System.out.println(dev.getTackling());
        System.out.println(pass.getGetPass());



    }
}
