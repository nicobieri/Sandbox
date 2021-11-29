package ch.teko.nb.demo;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayForEach {
    public static void main(String[] args) {
        ArrayList<Integer> Numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
// Lambda Expressions ab Java 8
        Numbers.forEach((n) -> System.out.println(n));
    }
}
