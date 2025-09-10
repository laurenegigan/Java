package com.gigan.encapsulation.library;

public class Book {

    public String isbn;
    protected String author;
    private String publisher;

    public void printBook(){
        System.out.println("This is a book");
    }

    protected void modifyBook(){
        System.out.println("Modify Book");
    }

    private void deleteBook(){
        System.out.println("Delete Book");
    }


}
