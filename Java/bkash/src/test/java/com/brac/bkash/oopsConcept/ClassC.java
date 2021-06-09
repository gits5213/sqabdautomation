package com.brac.bkash.oopsConcept;

public class ClassC implements InterfaceB, InterfaceA{

    public void bark(){
        System.out.println("woof");
    }



    public static int number = 10;

    public static int sum(int a, int b){
        return a+b;
    }


    @Override
    public void sum() {

    }

    @Override
    public void sub() {

    }
}
