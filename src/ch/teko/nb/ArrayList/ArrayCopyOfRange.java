package src.ch.teko.nb.ArrayList;

import java.util.ArrayList;

public class ArrayCopyOfRange {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
         // al.add("hello"); error
        //al.toArray();

        ArrayList ais =new ArrayList();
        ais.add(1);
        ais.add("hello");

        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
        'i', 'n', 'a', 't', 'e', 'd' };

        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 3, 9);

        System.out.println(new String(copyTo));
        System.out.println(ais);
        System.out.println(al);
    }

}
