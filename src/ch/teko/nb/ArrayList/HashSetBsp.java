package src.ch.teko.nb.ArrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetBsp {


    public static void main(String[] args) {

        HashSet<Integer> hi = new HashSet<>();
        hi.add(1);
        hi.add(2);
        System.out.println(hi.add(5));
        System.out.println(hi.add(1));
        System.out.println(hi.size());

        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(1);
        System.out.println(al.size());
    }
}
