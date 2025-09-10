package laurene.model;

import java.util.ArrayList;

public class Car {
    private int id;
    private String brand;
    private String color;
    private int speed;


    public Car() {
    }

//      Overladed Constructor
    public Car(int id, String brand, String color, int speed) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return ("Id : " + this.id + " Brand : " + this.brand + " Color : " + this.color + " Speed : " + this.speed);
    }

    //Affichage
    public static void main(String[] args) {
        //Nouveau objet
        Car myCar = new Car(1, "Ferrari", "red", 200);

        //Valeurs
        myCar.setId(1);
        myCar.setBrand("Ferrari");
        myCar.setColor("red");
        myCar.setSpeed(200);

        //Afficher
        System.out.println(myCar);
    }
}
