package ch.teko.nb.demo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputBuffered {

        public static void main(String[] args) throws IOException {
            BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
             w.write("Hello, buffered world\n");
             w.flush();


                long start = System.currentTimeMillis();
                for (int ii = 0; ii < 1_000_000; ii++) {
                    //System.out.print(ii);
                    w.write(ii);
                     }
                w.flush();
                 System.err.println("\nLoop time: " +
                         (System.currentTimeMillis() - start) +
                        " milliseconds");
                }
             }
