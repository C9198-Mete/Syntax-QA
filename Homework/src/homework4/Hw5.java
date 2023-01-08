package homework4;

import java.util.Scanner;

public class Hw5 {
    public static void main(String[] args){

        double num1=40;
        double num2=50;
        double num3=30;

        if (num1>num2 && num1>num3){
            System.out.println("The largest number is "+ num1);
        }else if (num2>num1 && num2>num3){
            System.out.println("The largest number is "+ num2);
        }else {
            System.out.println("The largest number is "+ num3);
        }
    }
}
