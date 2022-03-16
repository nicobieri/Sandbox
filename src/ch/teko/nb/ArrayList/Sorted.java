package src.ch.teko.nb.ArrayList;

import java.util.*;

public class Sorted {

    public static boolean isSorted(List<String> list) {
        return false;
    }

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Banana", "Lemon", "Orange", "Apple");
        List<String> r = new ArrayList<>();
    fruits.forEach(fruit ->
    {System.out.println(fruit.toUpperCase());
        r.add(fruit.toUpperCase());
    }
    );
        Iterator<String> iter = fruits.listIterator();
        try {
            String prev = null;
            String current = iter.next();
            while (iter.hasNext()) {
                prev = current;
                current = iter.next();
                if (prev.compareTo(current) > 0) {
                    System.out.println("false, nicht sortiert");
                }
                System.out.println(iter.next());
            }
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("null exception");
        }
    }
}
