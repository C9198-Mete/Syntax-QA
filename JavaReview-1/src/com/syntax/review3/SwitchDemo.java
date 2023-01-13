package com.syntax.review3;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int worldCup=input.nextInt();
        switch (worldCup){
            case 2022:
                System.out.println("Winner is Argentina");
                //break;
            case 2018:
                System.out.println("Winner is France");
                //break;
            case 2014:
                System.out.println("Winner is Germany");
                //break;
            case 2010:
                System.out.println("Winner is Spain");
               // break;
            case 2006:
                System.out.println("Winner is Italy");
                //break;
            case 2002:
                System.out.println("Winner is Brazil");
                //break;
            case 1998:
                System.out.println("Winner is France");
                //break;
            case 1994:
                System.out.println("Winner is Brazil");
                //break;
            default:
                System.out.println("hello");
        }
    }
}
