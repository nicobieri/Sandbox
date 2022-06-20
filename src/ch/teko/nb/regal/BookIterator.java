package src.ch.teko.nb.regal;

import java.util.Iterator;
import java.util.List;

public class BookIterator implements Iterator<Book> {

    private List<Book> bookList;
    private int pos = 0;

    public BookIterator(List<Book> bookList){
        this.bookList = bookList;
    }

    @Override
    public boolean hasNext() {
        return pos < bookList.size();
    }

    @Override
    public Book next() {
        return bookList.get(pos++);
    }
}
