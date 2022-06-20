package src.ch.teko.nb.demo;

import java.util.Arrays;

public class StringInCharacter {


    public static void main(String[] args) {
        String s = "hello world!";
        String k = "nico bieri!";
        //String b = "hello";
        int[] a =new int[s.length()];
        char[] b =new char[s.length()];
        char[] ca =new char[s.length()];
        char[] d = new char[k.length()];

        for(int idx = 0; idx < s.length(); idx++)   {
            System.out.print(s.charAt(idx));
            ca[idx] = s.charAt(idx);
        }
        System.out.println(Arrays.toString(b));
        for(int idx = 0; idx < s.length(); idx++) {
            System.out.print(s.charAt(idx) + ", ");
        }

        System.out.println("");
        System.out.println(ca);
        System.out.println(a);
        System.out.println(b);

        System.out.println(Arrays.toString(d));
        for (int idx = 0; idx < k.length(); idx++) {
            System.out.println(k.charAt(idx) + ", ");
        }
        System.out.println(d);
    }
    }

