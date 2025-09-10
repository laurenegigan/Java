package com.gigan.exercices;

public class Film {
    private String title;
    private String director;
    private int year;

    public Film(String title, String director, int year) {
        this.title = title;
        this.director = director;
        this.year = year;
    }

    //Getter et Setter pour title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //Getter et Setter pour director
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    //Getter et Setter pour year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return ("Title: " + title + "\nDirector: " + director + "\nYear: " + year);
    }

    public boolean isRecent() {
        return this.year > 2015;
    }

    //Affichage
    public static void main(String[] args) {
        Film myFilm = new Film("Harry Potter", "JK", 2015);

        myFilm.setTitle("Dune");
        myFilm.setDirector("Denis Villeneuve");
        myFilm.setYear(2021);

        System.out.println(myFilm);
        System.out.println("Is this film récent ? " + myFilm.isRecent());
    }
}
