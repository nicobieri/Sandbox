package src.ch.teko.nb.demo;

public class Pruefungsvorbereitung {

    public static void main(String[] args) {
        int number = 5;

        if (number > 5){
            System.out.println("grösser als 5");
        } else {
            System.out.println("kleiner als 5");
        }

        System.out.println( number >= 5 ? "grösser gleich 5" : "kleiner als 5");
    }
}
