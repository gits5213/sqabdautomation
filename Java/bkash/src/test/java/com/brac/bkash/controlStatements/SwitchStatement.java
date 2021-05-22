package com.brac.bkash.controlStatements;

public class SwitchStatement {

    public static void main(String[] args) {

        //The Java switch statement executes one statement from
        // multiple conditions.
        // It is like if-else-if ladder statement.
        //if-else-if

        int number = 10;
        switch (number){
            case 5:
                System.out.println("execute code!- Case Number-1");
                break;
            case 20:
                System.out.println("execute code!- Case Number-2");
                break;
            case 10:
                System.out.println("execute code!- Case Number-3");
                break;
            case 15:
                System.out.println("execute code!- Case Number-4");
                break;
            case 25:
                System.out.println("execute code!- Case Number-5");
                break;
            default:
                System.out.println("execute code!- Default");
        }




    }
}
