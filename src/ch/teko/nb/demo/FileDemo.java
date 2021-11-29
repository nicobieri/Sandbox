package ch.teko.nb.demo;

import java.io.File;
import java.io.IOException;

// Abfrage Pfrad nach einem Dokument / File

public class FileDemo {
    public static void main(String[] args) throws IOException {

         File f = null;
        String[] strs = {"test1.txt", "../test2.txt"};
        // for each string in string array
         for (String s : strs) {
             f = new File(s); // create new file object

            System.out.printf("%s - exists %b\n", s, f.exists());
            System.out.printf("%s - is file %b\n", s, f.isFile());
            System.out.printf("%s - executable %b\n", s, f.canExecute());
             System.out.printf("%s - absolute path %s\n", s, f.getAbsolutePath());
             // entfernt relative Angaben
             System.out.printf("%s - canonical path %s\n", s, f.getCanonicalPath());
             System.out.printf("%s - file size %d bytes\n", s, f.length());
            }
        }
}
