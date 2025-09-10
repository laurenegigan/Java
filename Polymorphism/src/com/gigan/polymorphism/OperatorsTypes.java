package com.gigan.polymorphism;

public class OperatorsTypes {
    public static void main(String[] args) {


        // OPERATOR TYPES

        //ASSIGNEMENTS OPERATORS

        // =, +=, -=, *=, /= //Assign a value to a variable

        int a = 10;
        System.out.println("a = " + a);
            a += 10;
            System.out.println("a = " + a);


        a = a++
        System.out.println("a = " + a);

        a = a++ + a;
        System.out.println("a = " + a);

        a = a++ + a + a-- - a-- + ++a;
        // 10 + 11 + 11 - 10 + 10
        System.out.println("a = " + a);



        //Arithmetic operators
        // +, -,*, /, %, ++, -- //Add, subtract, multiply, divide, and modulus


        //Relation operators
        // >, <, >=, <=, ==, =/= // Compare two values

        //Logical operators
        // &&, ||, ! // AND, OR, NOT Evaluate two expressions and return a boolean value
    }
}
