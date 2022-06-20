package src.ch.teko.nb.demo;

public class Fibonaci {
    static long fib (long n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        long start2 = System.currentTimeMillis();
        int index = 50;
        System.out.println(fib(index));
        long end2 = System.currentTimeMillis();
        System.out.println("Index: " + index + " - elapsed Time in mili seconds: " + (end2-start2));
    }
}
