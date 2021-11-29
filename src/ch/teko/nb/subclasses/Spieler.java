package src.ch.teko.nb.subclasses;

//Superclass
public class Spieler {
    public String pass = "pass";
    public String getPass = "passed";
    public String getBall = "gets the Ball";

    public String getPass() {
        return pass;
    }

    public String getGetBall() {
        return getBall;
    }

    public String getGetPass() {
        return getPass;
    }

    public Spieler() {
        System.out.println("pass");
    }




}
