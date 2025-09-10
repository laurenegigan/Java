package com.gigan.exercices;

public class Cercle {
    private double ray;

    //Constructeur
    public Cercle(double ray) {
        this.ray = ray;
    }

    //Getter et setter pour rayon
    public double getRay() {
        return ray;
    }

    public void setRay(double ray) {
        this.ray = ray;
    }

    //Calculs
    public double calculateArea() {
        return Math.PI * ray * ray;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * ray;
    }

    //Affichage
    public void view() {
        System.out.println("Ray : " + ray);
        System.out.println("Area : " + calculateArea());
        System.out.println("Perimeter : " + calculatePerimeter());
    }

    public static void main(String[] args) {
        //Créer un nouveau cercle
        Cercle myCercle = new Cercle(3.5);

        //Modifier ses valeurs
        myCercle.view();
        System.out.println("Ray recovered from getRayon() : " + myCercle.getRay());

        //L'afficher
        myCercle.setRay(5);
        System.out.println("\nAfter modification of ray :" );
        myCercle.view();
    }
}
