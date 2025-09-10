package com.gigan.app.inheritance;

class Parent {
        void parent (){
            System.out.println("Parent is running");
        }
}

    //Child_1 and Child_2 extends from Parent class

class Child_1 extends Parent {
        void Child_1() {
            System.out.println("Child 1 is running");
        }
}

class Child_2 extends Parent {
        void Child_2() {
            System.out.println("Child 2 is running");
        }
}

    //HIERARCHICAL INHERITANCE
public class HierarchicalIn {
        public static void main(String[] args) {

            Child_1 obj = new Child_1();
            obj.parent();
            obj.Child_1();

            Child_2 obj_2 = new Child_2();
            obj_2.parent();
            obj_2.Child_2();

        }
}


