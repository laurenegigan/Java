package com.gigan.polymorphism;

public class Calculator {

    //Add method two integers
    public int add(int a, int b){
        return a + b;
    }

    //Add method three integers
    public int add(int a, int b, int c){
        return a + b + c;
    }

    //Add method two double
    public double add(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(1, 2));
        System.out.println(c.add(1, 2, 3));
        System.out.println(c.add(1.1, 2.2));
    }
}
