package ch.teko.nb.demo;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {
    public static void main(String[] args) throws IOException {

        if (args.length != 0) {
            File f = new File(args[0]);
        }

        String fileName = args.length == 0 ? "test3.txt" :args[0];

        String[] stars = {"test.1", "../test3.txt"};

        for (String s : stars) {
            //f = new File(s); //create new File Object

        //    printProperties(s,f);
        }
}
static void printProperties(String s, File f) throws IOException {
    System.out.printf("%s - exists %b\n", s, f.exists());
//    f.mkdirs() zum beispiel um ein Ordner zu erstellebn
    }
}
