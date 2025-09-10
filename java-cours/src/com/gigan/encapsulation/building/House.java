package com.gigan.encapsulation.building;

import com.gigan.encapsulation.library.Book;

public class House {

    public House() {

        Book book =  new Book();
        String isbn = book.isbn;
        book.printBook();




    }

}
