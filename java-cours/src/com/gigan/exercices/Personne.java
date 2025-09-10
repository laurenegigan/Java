package com.gigan.exercices;

public class Personne {
    private String nom;
    private int age;

    // Constructeur
    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    //Getter et Setter pour nom
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    //Getter et setter pour âge
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Nom : " + this.nom + ", Âge : " + this.age;
    }

    //Affichage
    public static void main(String[] args) {
        //Créer une nouvelle personne
        Personne myPersonne = new Personne("Jean", 25);

        //Modifier ses valeurs
        myPersonne.setNom("Paul");
        myPersonne.setAge(30);

        //L'afficher
        System.out.println(myPersonne);
    }
}
