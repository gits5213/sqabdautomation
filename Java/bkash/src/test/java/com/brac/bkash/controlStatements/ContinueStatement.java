package com.brac.bkash.controlStatements;

public class ContinueStatement {
    /*
    The Java continue statement is used to continue the loop.
    It continues the current flow of the program and skips the
    remaining code at the specified condition. In case of an inner
    loop, it continues the inner loop only.
     */
    public static void main(String[] args) {

        for (int i=1; i<=10; i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}
