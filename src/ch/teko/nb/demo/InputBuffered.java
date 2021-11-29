package ch.teko.nb.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputBuffered {

    public static void main(String[] args) {
        System.out.println(">>");

        try {


            System.out.println(System.in.read());
            Scanner in = new Scanner(System.in);
             String s = in.nextLine();
             System.out.println("You entered string "+s);
             int a = in.nextInt();
             System.out.println("You entered integer "+a);
             float b = in.nextFloat();
             System.out.println("You entered float "+b);


            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            // System.err
            // System.out
           String name = reader.readLine();
            System.out.println(name);
            System.out.println(Integer.parseInt(name));
       } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        catch (NumberFormatException ex) {
            System.out.println("not a number");
        }
    }
}