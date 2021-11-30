package src.ch.teko.nb.subclasses.sub;

import src.ch.teko.nb.subclasses.Spieler;

public class Messi extends Spieler {
    public String namePlayer1 = "messi";
    public String dribbling = "Trick";
    private String getDribbling = "Dribbling";
    int Defence;

    public String getGetDribbling() {

        return getDribbling;
    }


    public Messi(int Defence) {
        System.out.println("Messis Defense = " + Defence);
        this.Defence = Defence;
    }
    //protected void messiPass(){
     //   System.out.println(this.dribbling);
      //  System.out.println(super.getBall);

    public void messiPass(){
    System.out.println(getDribbling);
    System.out.println(super.getBall);
    System.out.println(super.yellowCards);

}
}
