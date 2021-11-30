package src.ch.teko.nb.subclasses;

public class Ramos extends Spieler{
    public String tackling = "tackles";
    int Defence;

    //Konstruktor von Ramos
    Ramos(){
        super();
        System.out.println("Ramos Const");
    }
    // super();  Das super Keyword muss immer zu oberst im Konstruktor stehen,
    // sonst funktioniert es nicht (Ablauf wird gestört- zuerst Elternklasse, dann in die Subklasse).
    Ramos(int Defense){
        System.out.println("Ramos Defense = " + Defense);
        this.Defence = Defense;
    //Hier kann man dem Konstruktor einen Wert übergeben
    //Durch das this. wird der Parameter in die Variable der jeweiligen Klasse übertragen.
}

protected void ramosPlays(){
        System.out.println(tackling);
        System.out.println(this.tackling);
        System.out.println(super.block);
        System.out.println(this.Defence + " this. Defence");
        System.out.println(super.yellowCards + " //super. (Spieler)");

    }

}
