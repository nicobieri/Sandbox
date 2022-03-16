package src.ch.teko.nb.demo;

public class newThisSuper {
    static class Base
    {
        private int i;
        Base(int i) {this.i = i; }
    }
    static class Derived extends Base {
        private int i;
        Derived(int i)
        {
            super (i);
            this.i = i;
            System.out.println(this.i);
        }
    }

    public static void main(String[] args) {
        Base d = new Derived(2);
        System.out.println(d);
    }
}
