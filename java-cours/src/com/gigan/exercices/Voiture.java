package com.gigan.exercices;

public class Voiture {

    //Attribut
        private String marque;
        protected int annee;
        String modele;
        public String couleur;

    //Constructeur
    public Voiture(String marque, int annee, String modele, String couleur) {
        this.marque = marque;
        this.annee = annee;
        this.modele = modele;
        this.couleur = couleur;
    }

    //Getter et Setter marque
    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    //Getter et Setter annee
    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    //Getter et Setter marque modele
    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String toString () {
        return "Marque : " + this.marque
        + ", Année : " + this.annee
        + ", Modèle :" + this.modele
        + ", Couleur : " + this.couleur;
    }

    public static void main (String[] args) {
        Voiture myVoiture = new Voiture("Toyota", 2022, "Corolla", "Bleue");

        myVoiture.setMarque("Toyota");
        myVoiture.setAnnee(2022);
        myVoiture.setModele("Corolla");
        myVoiture.couleur = "Bleue";

        System.out.println(myVoiture);
    }
}
