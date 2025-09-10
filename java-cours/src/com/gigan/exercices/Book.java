package com.gigan.exercices;

public class Book {

    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    //Getter et Setter pour title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //Getter et Setter pour author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //Getter et Setter pour year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return ("Title : " + this.title + ", Author : " + this.author + ", Year : " + this.year);
    }

    public boolean isOld() {
        return this.year > 1945;
    }

    //Affichage
    public static void main(String[] args) {
        //Créer un nouvel instance
        Book myBook = new Book("La Vérité du l'affaire Harry Québert", "Joel Dicker", 2012);

        //Modifier ses valeurs
        myBook.setTitle("Le Petit Prince");
        myBook.setAuthor("Antoine de Saint-Exupéry");
        myBook.setYear(1943);

        System.out.println(myBook);
        System.out.println("Is this book old ? " + myBook.isOld());
    }
}
