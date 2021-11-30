package src.ch.teko.nb.subclasses;

//Superclass
public class Spieler {
    public String pass = "pass";
    public String block = "blockt";
    public String getPass = "passed";
    public String getBall = "gets the Ball";
    public String yellowCards = "Yellow Card";

    public Spieler() {
        System.out.println("Spieler Const");
    }
    protected void redCard(){
        System.out.println("Red Card");
    }

    public String getPass() {
        return pass;
    }

    public String getGetBall() {
        return getBall;
    }

    public String getGetPass() {
        return getPass;
    }





}
