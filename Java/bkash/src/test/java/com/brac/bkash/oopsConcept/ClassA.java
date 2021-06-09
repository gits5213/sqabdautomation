package com.brac.bkash.oopsConcept;

public class ClassA {

    public void bark(){
        System.out.println("woof");
    }

    //Overloading
    public void bark(int num){
        System.out.println("woof");
    }





    public static void main(String[] args) {
        /*
        Polymorphism in Java is a concept by which we can perform a single action in different
        ways. Polymorphism is derived from 2 Greek words: poly and morphs. The word "poly"
        means many and "morphs" means forms. So polymorphism means many forms.

        There are two types of polymorphism in Java: compile-time polymorphism and
        runtime polymorphism. We can perform polymorphism in java by method overloading
        and method overriding.

        If you overload a static method in Java, it is the example of compile time polymorphism.
        Here, we will focus on runtime polymorphism in java.
         */

        //Overloading vs Overriding

        //Overloading
        //Same class
        //Same method name different parameter (arguments) | signature

        //Overriding
        //Different class
        //Same method name same parameter (arguments) | signature

    }
}
