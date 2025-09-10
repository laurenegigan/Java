package com.gigan.app.inheritance;

class GrandMother{
    void GrandMother(){
        System.out.println("GrandMother is dancing");
    }
}

interface Uncle {
    void lipsinging();
}

interface Daughter{
    void dancing();
}

class Family extends GrandMother implements Uncle,Daughter{

    public void lipsinging() {
        System.out.println("Uncle is lipsinging");
    }

    public void dancing() {
        System.out.println("Daughter is dancing");
    }

    void Family(){
        System.out.println("Family is singing");
    }
}


public class HybridIn {
    public static void main(String[] args) {
         Family f = new Family();
         f.lipsinging();
         f.dancing();
         f.GrandMother();
         f.Family();
    }
}
