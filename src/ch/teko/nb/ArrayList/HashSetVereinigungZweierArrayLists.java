package src.ch.teko.nb.ArrayList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetVereinigungZweierArrayLists {

    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 3, 5, 7, 9));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(2, 4, 6, 8));

        System.out.println("s1 before union: " + s1);
        System.out.println("s2: " + s2);

        s1.addAll(s2);

        System.out.println("s1 after union: " + s1);

        s1.retainAll(s2);
        //s1.removeAll(s2);

        System.out.println(s2);

        System.out.println("------------------------------------------------------------");

        Set<String> A = new HashSet<>(Arrays.asList("1", "3", "5", "7", "9"));
        Set<String> B = new HashSet<>(Arrays.asList("2", "4", "6", "8"));

        System.out.println("A before union: " + A);
        System.out.println("B: " + B);

        A.addAll(B);

        System.out.println("B after union: " + A);

        A.retainAll(B);
        //A.removeAll(B);

        System.out.println("B ohne A Ich gebe jedoch A aus" + A);


    }

}
