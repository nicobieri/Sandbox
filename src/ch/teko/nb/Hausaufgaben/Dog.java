package src.ch.teko.nb.Hausaufgaben;

public class Dog extends Animal {

    public void helloDog() {
        System.out.println("Hello from Dog");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.helloDog();
    }
}
