package src.ch.teko.nb.regal;

import java.util.Iterator;

public class Tasche implements Iterable<Book>, Iterator<Book> {
    Book book1 = new Book("neues Buck");
    Book book2= new Book("neues Buck");
    Book book3 = new Book("neues Buck");
    Book book4 = new Book("neues Buck");

    int pos = 0;
    @Override
    public Iterator<Book> iterator() {
        return this;
    }


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Book next()
    {
        switch(++pos){
            case 1: return book1;
            case 2: return book2;
            case 3: return book3;
            case 4: return book4;
            default:
                break;
        }
        return null;
    }}
