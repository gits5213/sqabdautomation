package com.brac.bkash.ObjectClass;

import java.util.ArrayList;
import java.util.Collections;

public class JavaArray {
    public static void main(String[] args) {
        /*
        Java Array
        - Java array is an object which contains elements of a similar data type
        - We can store only a fixed set of elements in a Java array.
        - Array in Java is index-based, the first element of the array is
         stored at the 0th index, 2nd element is stored on 1st index and so on.

         - Code Optimization: It makes the code optimized, we can retrieve or sort the
         data efficiently.
            - Random access: We can get any data located at an index position.

            -Single Dimension
            - Multi Dimension
         */

        //Initialization array variable or
        //Initialization variable array
//        dataType [] arr;
//        dataType x [] ;

//        int arr [] = new int[5];
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//        arr[3] = 40;
//        arr[4] = 50;

        int arr [] = {10, 20, 30, 40, 50};

        String arr1 [] = {"Mahabub", "Ashik", "Amit", "Talha"};

        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        arr2.add(3);
        arr2.add(4);
        arr2.add(5);
        arr2.add(6);

        Collections.reverse(arr2);
        System.out.println("Array List ======" + arr2);

    //for
//        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }
        System.out.println("====Index number two: " + arr1[1]);
        System.out.println("====Array Length: " + arr1.length);

        //enhance for loop
//        for(String x: arr1){
//            System.out.println("Print Total Array Values: " + x);
//        }






    }
}
