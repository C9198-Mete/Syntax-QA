package com.syntax.review2;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("What is your name");
        String name=input.nextLine();
        System.out.println("enter your mom and dad name");
        String mom=input.nextLine();

        System.out.println("Please enter your age");
        int age=input.nextInt();
        System.out.println("Are you tired");
        boolean tired=input.nextBoolean();

        System.out.println("Please enter your state/city");
        String stCt=input.next();


        System.out.println(mom+ "I'm "+name+" and "+ age+" years old and I live in "+ stCt + " and am i tired "+ tired);

    }
}
