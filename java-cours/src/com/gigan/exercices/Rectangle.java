package com.gigan.exercices;

public class Rectangle {
    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public static void main(String[] args) {
        Rectangle monRectangle = new Rectangle(4, 6);

        // modifier le rectangle
        monRectangle.setLongueur(10);
        monRectangle.setLargeur(5);

        System.out.println("Longueur : " + monRectangle.getLongueur());
        System.out.println("Largueur : " + monRectangle.getLargeur());
    }
}