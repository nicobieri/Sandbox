package src.ch.teko.nb.Generics;


public class Box<T> {
    T value;
    Box (T value) {
        this.value = value;
    }

    Class getClassName() {
        return value.getClass();
    }

    public static void main(String[] args) {
        var test = new Box<>("Nico");
        test.value = new String();

        System.out.println(test.getClassName());
    }
}

