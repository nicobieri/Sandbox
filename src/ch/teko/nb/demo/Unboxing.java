package src.ch.teko.nb.demo;

public class Unboxing {
    static void mymethode(int i){
    }

    public static void main(String[] args) {
        Integer i = 1; // boxing
        Unboxing.mymethode(i); // Unboxing

        System.out.println(i);

    }
}
