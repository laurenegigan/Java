package com.gigan.polymorphism;

abstract class Instrument{

    //Abstract Method
    public abstract void play();

    //Non-Abstract Method
    public void adjust (){
        System.out.println("Adjusting Instrument");
    }
}


class Guitar extends Instrument{
    @Override
    public void play() {
        System.out.println("Playing Guitar ...");
    }
}

class Piano extends Instrument{
    @Override
    public void play() {
        System.out.println("Playing Piano ...");
    }
}


public class Abstraction {
    public static void main(String[] args) {
        Instrument myGuitar = new Guitar();
        Instrument myPiano = new Piano();

        myGuitar.play();
        myPiano.adjust();


    }
}
