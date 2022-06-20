package src.ch.teko.nb.regal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shelf implements Iterable<Book>{

    private List<Book> bookList = new ArrayList<>();

    public Shelf(List<Book> bookList){
        this.bookList = bookList;
    }
    @Override
    public Iterator<Book> iterator() {
        //return new BookIterator;
        return ((ArrayList<Book>)bookList).iterator();
    }

    void add(Book book){

        bookList.add(book);
    }
    // no go! keine Datenkapselung
    List<Book> getBookList() {
        return bookList;
    }

}
