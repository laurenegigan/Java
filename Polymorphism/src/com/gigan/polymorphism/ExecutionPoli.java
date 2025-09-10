package com.gigan.polymorphism;

//
class Animal {
    //Superclass method
    public void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    //Overloading
    @Override
    public void sound() {
        System.out.println("Dog bark");

    }
}

class Capybara extends Animal {
    @Override
    public void sound() {
        System.out.println("Capybara squeak");
    }
}



public class ExecutionPoli {
    public static void main(String[] args) {

        Animal myDog = new Dog();
        Animal myCapybara = new Capybara();

        myDog.sound();
        myCapybara.sound();

    }
}
