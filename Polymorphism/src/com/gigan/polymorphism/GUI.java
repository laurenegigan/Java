package com.gigan.polymorphism;

interface GUIComponent {
    void draw(); //abstract method
    void resize(); //abstract method
}

class Button implements GUIComponent {
    @Override
    public void draw() {
        System.out.println("Drawing Button ...");
    }

    @Override
    public void resize() {
    System.out.println("Resizing Button ...");
    }
}

class Textfield implements GUIComponent {
    @Override
    public void draw() {
        System.out.println("Drawing Textfield ...");
    }

    @Override
    public void resize() {
        System.out.println("Resizing Textfield ...");
    }
}

    //First Real Case

public class GUI {
    public static void main(String[] args) {

    }
}
