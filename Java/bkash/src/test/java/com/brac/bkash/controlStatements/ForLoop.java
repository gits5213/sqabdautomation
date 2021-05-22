package com.brac.bkash.controlStatements;

/*
The Java for loop is a control flow statement
that iterates a part of the programs multiple times.

If the number of iteration is fixed, it is recommended to
use for loop.
//Syntax
for(init;condition;incr/decr){
// code to be executed
}
 */

public class ForLoop {
    public static void main(String[] args) {

//        for (int i=0; i<10; i++){
//            System.out.println(i);
//        }
//
//        for (;;){
//
//        }

        for(int i=1; i<=3; i++){
            for(int j=1; j<=3; j++){
                for(int k=1; k<=3; k++){
                    System.out.println(i + " "+j +" " + k);
                }
            }
        }

        }
    }

