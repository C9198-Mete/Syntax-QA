package com.syntax.review4;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {

        int [] arr=new int[3];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;

        System.out.println(arr[2]);
        System.out.println("Size of the array: "+arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int nums:arr) {
            System.out.print(nums+" ");
        }
        System.out.println();
        System.out.print(Arrays.toString(arr));
        System.out.println();


        String[] colors={"black","white","red","purple","blue"};
        for (String col:colors) {
            System.out.print(col);
        }



    }
}
