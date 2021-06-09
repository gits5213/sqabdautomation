package com.brac.bkash.ObjectClass;

public class UserAbleToLogIn {

    UserAbleToLogIn(){

    }
    /*
    In Java, a constructor is a block of codes similar to the method.
    It is called when an instance of the class is created.
    At the time of calling constructor, memory for the object is
    allocated in the memory.

    Every time an object is created using the new() keyword,
    at least one constructor is called.

    It calls a default constructor if there is no constructor available
    in the class. In such case, Java compiler provides a default
    constructor by default.

    Rules for creating Java constructor
    - There are two rules defined for the constructor.

    - Constructor name must be the same as its class name
    - A Constructor must have no explicit return type
    - A Java constructor cannot be abstract, static, final, and synchronized

    There are two types of constructors in Java:
    - Default constructor (no-arg constructor)
    - Parameterized constructor
     */


    static int number = 10;
    static void sum(int a, int b, int c){

    }
    //The static keyword in Java is used for memory management mainly.
    //It makes your program memory efficient (i.e., it saves memory).
    //variable
    //method
    //Block
    //nested class


    public static void main(String[] args) {
        /*
        - A Class can defined as a template or blueprint which describes state/
        behavior of it's object
        - In other word a class is used to create a Objects.
        - A class is declared by using class keyword

        Object:
        - Object are nothing but the instance of the class
        - a single class can create any number of unique objects
         */

        UserAbleToLogIn ual = new UserAbleToLogIn();
        //this.number;
        //this.sum();

        /*
        Garbage Collection:
        - Garbage Collection is the mechanism provided by JVM, to clean
        out the Heap, so that new objects can be created.
        - it destroys the objects which are "not in use" or eligible
        for "garbage collection"
        - Any object is said to be eligible for garbage collection if there
        is no reference variable attached to it
        - Variable are named space of memory which stores the data
         */

        /*
        - this can be used to refer current class instance variable.
        - this can be used to invoke current class method (implicitly)
        - this() can be used to invoke current class constructor.
        - this can be passed as an argument in the method call.
        - this can be passed as argument in the constructor call.
        - this can be used to return the current class instance from the method.
         */
    }
}
