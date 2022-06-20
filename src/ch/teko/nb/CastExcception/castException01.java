package src.ch.teko.nb.CastExcception;

import java.util.ArrayList;
import java.util.List;

public class castException01 {

    // Cast Exception, der Compiler sagt es ist on jedoch wird beim ausführen eine Cast Excception geworfen

 //   static List<Song> typisiert = new ArrayList<>();
    static List<String> typisiertS = new ArrayList<>();

    public static void main(String[] args) {
 //       List untypisiert = typisiert;
        List typisiert = typisiertS;
 //       untypisiert.add("I'm a String");
        typisiertS.add("I'm a String");
        typisiertS.add("I'm a String1");
  //      Song song = typisiert.get(0);
        typisiert.get(0);
        System.out.println(typisiert.get(1));



    }


}
