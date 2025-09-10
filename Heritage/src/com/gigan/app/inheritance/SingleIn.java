package com.gigan.app.inheritance;

class A{
    int speed = 300;
}

class B extends A{
    void bike(){
        System.out.println("Bike is running at speed of " + speed);
    }
}



public class SingleIn {

    public static void main(String[] args) {
        //Creating Single Inheritance

        B obj = new B();
        obj.bike();
    }
}
