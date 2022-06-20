package src.ch.teko.nb.Hausaufgaben;

public class Bird extends Animal{

    public void helloBird() {
        System.out.println("hello from Dog");
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.helloBird();
    }
}
