package src.ch.teko.nb.demo;

import java.util.HashSet;
import java.util.List;

// stelle sicher, dass jedes buck mindestens einen Autor hat.

public class Book {
    private List<Autor> autors;
    //public Book() {}
    private Book(Autor autor) {
        autors.add(autor);
    }
    private Book(List<Autor> autors) {
        this.autors = autors;
        }

    // new Book();
    public static void main(String[] args) {
      //  new Book();
        HashSet<Integer> hi = new HashSet<>();
        System.out.println(hi.add(1));
        System.out.println(hi.add(2));
        System.out.println(hi.add(3));
    }

    public Book boolFactory(Autor autor) {
        return new Book(autor);

    }
    public Book boolFactory(List<Autor> autors) throws Exception {
        if (autors.isEmpty()) {
            throw new Exception();
        }
        return new Book(autors);
    }
}
