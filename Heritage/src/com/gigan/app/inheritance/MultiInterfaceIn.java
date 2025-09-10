package com.gigan.app.inheritance;

interface Coder{
    void coding();
}

interface Dancer{
    void dancing();
}

class Person implements Coder, Dancer{

    public void coding() {
       System.out.println("Person is coding...");
    }

    public void dancing() {
        System.out.println("Person is dancing...");
    }

}

//MULTIPLE INTERFACE INHERITANCE
public class MultiInterfaceIn {
    public static void main(String[] args) {

        Person person = new Person();
        person.coding();
        person.dancing();
    }
}
