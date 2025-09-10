package com.gigan.encapsulation.library;

public class CourseBook extends Book{

    public CourseBook() {
        Book book = new Book();
        book.author = "Pedro";
        book.modifyBook();
    }
}
