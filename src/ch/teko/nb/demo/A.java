package src.ch.teko.nb.demo;

public class A {
    private A() {}
    static public  A factory() {
        return new A();
    }
}
