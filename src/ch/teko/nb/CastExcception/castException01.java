package src.ch.teko.nb.CastExcception;

import java.util.ArrayList;
import java.util.List;

public class castException01 {

    static List<Song> typisiert = new ArrayList<>();

    public static void main(String[] args) {
        List untypisiert = typisiert;
        untypisiert.add("I'm a String");
        Song song = typisiert.get(0);
    }
}
