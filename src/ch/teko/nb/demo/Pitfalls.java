package ch.teko.nb.demo;

import java.util.Random;

public class Pitfalls {

 public static void main(String args[]) {
             Random rand = new Random();
             int upperbound = 32;
             //generate random values from 0 - upperbound-1
             int ii = rand.nextInt(upperbound);
             if (ii == 2)
                if (ii == 3)
                 System.out.print(ii);
             else
             System.out.print(ii);
            }
}

