package com.gigan.encapsulation.library;

public class Librarian {

    public Librarian(){
        Book book = new Book();
        book.author = "Frank";
        book.modifyBook();
    }
}
