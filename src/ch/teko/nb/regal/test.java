package src.ch.teko.nb.regal;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>(
                List.of(new Book("Oyssee"), new Book("Ilias"), new Book("kosnut"))
        );

                Shelf shelf = new Shelf(books);
                for (Book book:shelf) {
                    System.out.println(book.getName());
                }
        Tasche tasche = new Tasche();
        for (Book book:tasche) {
            System.out.println(book.getName());
        }
    }
}
