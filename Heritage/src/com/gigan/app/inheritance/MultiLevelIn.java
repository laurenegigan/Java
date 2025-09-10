package com.gigan.app.inheritance;

    // Inheritance with multiple levels
class GrandFather{
    void GrandFather(){
        System.out.println("GrandFather is running");
    }
}

class Father extends GrandFather{
    void Father(){
        System.out.println("Father is running");
    }
}

class Child extends Father{
    void Child(){
        System.out.println("Child is running");
    }
}






public class MultiLevelIn {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.GrandFather();
        obj.Father();
        obj.Child();
    }
}
