package src.ch.teko.nb.demo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class CloneAndCopy {
    public static void main(String[] args) {
        List<String> c1 = new LinkedList<>(Arrays.asList("A",  "B", "C"));
        System.out.println("Original linked list: " + c1);

        LinkedList c2 = new LinkedList<>() ;
        c2 = (LinkedList) ((LinkedList<String>) c1).clone();
        System.out.println(c2);

        List c3 = new LinkedList<>();
        for (String s : c1) {
            //c3.add(s.toLowerCase(Locale.ROOT));
            char a[] = s.toCharArray();
            // a to String()
            String.copyValueOf(a);
        }
        System.out.println(c3);
    }
}
